package com.spring.todoapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    String title;
    boolean urgent;
    boolean done;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean urgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        urgent = urgent;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        done = done;
    }

    @Override
    public String toString() {
        return title;
    }
}
