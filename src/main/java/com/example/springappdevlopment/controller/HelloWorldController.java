package com.example.springappdevlopment.controller;


import com.example.springappdevlopment.model.User;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello from Shalesh dutt";
    }

    // localhost:8080/hello/query
    //@RequestMapping requests the data from a specified resource
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

    // @PostMapping submits the processed data to a specified resource
    //@RequestBody annotation tells Spring to deserialize an incoming request
    // body into an object passed as a parameter to the handler method.
    @PostMapping("/post")
    public String sayhello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + "!";
    }
}
