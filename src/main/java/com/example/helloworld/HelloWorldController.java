package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public String goodbyeWorld(){
        return "Goodbye World by Spring Boot";
    }

}
