package com.bootcamp.springboot.controller;

import com.bootcamp.springboot.configs.DbConfig;
import com.bootcamp.springboot.model.Person;
import com.bootcamp.springboot.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private PersonService _personService;
    private DbConfig _dbConfig;

    @Autowired
    public PersonController(PersonService personService, DbConfig dbConfig) {
        this._personService = personService;
        this._dbConfig = dbConfig;
    }

    //move to different controller
    @GetMapping("/message")
    public String getMessage() {
        return this._dbConfig.getDevMessage();
    }

    @GetMapping("/person")
    public Person getPerson(){
        return this._personService.getPerson();
    }
}
