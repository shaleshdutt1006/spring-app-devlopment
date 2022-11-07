package com.example.springappdevlopment.controller;


import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello from Shalesh dutt";
    }


}
