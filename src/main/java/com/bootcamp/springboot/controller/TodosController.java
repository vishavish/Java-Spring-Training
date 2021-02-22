package com.bootcamp.springboot.controller;

import com.bootcamp.springboot.model.Todo;
import com.bootcamp.springboot.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/todos")
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

    @GetMapping("/list")
    public String todos(Model model) {
        model.addAttribute("todoList",this._todoService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Todo todo) {
        return "create";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute Todo todo) {
        try {
            this._todoService.save(todo);
        } catch (Exception e) {
            System.out.println(e);
        }

        return "redirect:/todos/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        try {
            Optional<Todo> todo = this._todoService.findById(id);
            if (todo.isPresent()) {
                model.addAttribute("todo", todo.get());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return "update";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") long id, @ModelAttribute Todo todo) {
        try {
            this._todoService.save(todo);
        } catch (Exception e) {
            System.out.println(e);
        }

        return "redirect:/todos/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        try {
            this._todoService.delete(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return "redirect:/todos/list";
    }

}
