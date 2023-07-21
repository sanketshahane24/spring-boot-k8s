package com.csuf.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/msg")
    public String welcomeMessage(){
        return "Welcome to K8s spring boot demo";
    }

    @GetMapping()
    public String printMyName(@RequestParam String name){
        return "Hello "+name;
    }
}
