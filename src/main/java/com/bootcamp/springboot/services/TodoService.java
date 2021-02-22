package com.bootcamp.springboot.services;

import com.bootcamp.springboot.model.Todo;
import com.bootcamp.springboot.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return this.todoRepository.findAll();
    }

    public Optional<Todo> findById(long id) {
        return this.todoRepository.findById(id);
    }

    public Optional<Todo> findByName(String name) {
        return this.todoRepository.findByName(name);
    }

    public void save(Todo toDo) {
        this.todoRepository.save(toDo);
    }

    public void delete(long id) {
        this.todoRepository.deleteById(id);
    }
}
