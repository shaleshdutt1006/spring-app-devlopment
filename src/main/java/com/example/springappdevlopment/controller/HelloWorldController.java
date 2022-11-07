package com.example.springappdevlopment.controller;


import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello from Shalesh dutt";
    }

    // localhost:8080/hello/query
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayhello(@RequestParam(value = "name") String name) {
        return "Hello" + name + "!";
    }

    // localhost:8080/hello/param/shalesh
    //@PathVariable annotation is used to extract the value from the URL
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
