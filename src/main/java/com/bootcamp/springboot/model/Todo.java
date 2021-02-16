package com.bootcamp.springboot.model;

public class Todo {
    private Integer id;
    private String name;
    private Boolean isDone;

    public Todo(Integer _id, String _name) {
        this.id = _id;
        this.name = _name;
        this.isDone = false;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer _id) {
        this.id = _id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String _name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return this.isDone;
    }

    public void setStatus(Boolean _status) {
        this.isDone  = _status;
    }
}
