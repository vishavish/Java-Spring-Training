package com.bootcamp.springboot.controller;

import com.bootcamp.springboot.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodosController {

    private final TodoService _todoService;

    @Autowired
    public TodosController(TodoService todoService) {
        this._todoService = todoService;
    }

    @GetMapping("/greeting")
    public String greeting(String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/todos")
    public String todos(Model model) {
        model.addAttribute("todoList",this._todoService.getAll());
        return "todos";
    }

}
