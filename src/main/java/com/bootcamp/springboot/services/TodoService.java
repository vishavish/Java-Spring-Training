package com.bootcamp.springboot.services;

import com.bootcamp.springboot.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    public List<Todo> getAll() {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(1, "Sweep."));
        todos.add(new Todo(2, "Cook."));
        todos.add(new Todo(3, "Sleep."));

        return todos;
    }
}
