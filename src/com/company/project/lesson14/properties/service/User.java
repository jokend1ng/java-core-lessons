package com.company.project.lesson14.properties.service;

public class User <T> {
    private String username;
    private T id;

    public User(String username, T id) {
        this.username = username;
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
