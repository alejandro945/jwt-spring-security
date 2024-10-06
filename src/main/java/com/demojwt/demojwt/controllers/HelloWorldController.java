package com.demojwt.demojwt.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
    
    @GetMapping("/")
    public String message() {
        return "Welcome to the home page!";
    }

    @GetMapping("hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
    
    
}
