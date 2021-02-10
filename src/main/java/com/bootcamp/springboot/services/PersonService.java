package com.bootcamp.springboot.services;

import com.bootcamp.springboot.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public Person getPerson() {
        return new Person("Juan", "dela Cruz", 27);

    }
}
