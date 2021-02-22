package com.bootcamp.springboot.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long  id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Status")
    private Boolean isDone;

    public Todo() {
    }

    public Todo(long id, String name, Boolean status) {
        this.id = id;
        this.name = name;
        this.isDone = status;
    }

    public long  getId() {
        return this.id;
    }

    public void setId(long  id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return this.isDone;
    }

    public void setStatus(Boolean status) {
        this.isDone  = status;
    }
}
