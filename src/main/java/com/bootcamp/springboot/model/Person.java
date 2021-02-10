package com.bootcamp.springboot.model;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person (String _firstName, String _lastName, Integer _age) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.age = _age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
