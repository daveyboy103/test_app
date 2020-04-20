package com.velocity.testapp.controllers;

public class MyOutput{
    public MyOutput(String name) {
        this.setName(name);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
