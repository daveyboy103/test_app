package com.velocity.testapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class MyController {

    @GetMapping("{myName}")
    public MyOutput getSample(@PathVariable String myName){
        return new MyOutput(myName.toUpperCase());
    }
}

