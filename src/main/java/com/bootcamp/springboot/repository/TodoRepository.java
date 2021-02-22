package com.bootcamp.springboot.repository;

import com.bootcamp.springboot.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Query(value = "select t from Todo t where t.name = ?1")
    Optional<Todo> findByName(String name);

}
