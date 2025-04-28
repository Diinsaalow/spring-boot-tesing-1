package com.spring.exercise_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/great")
    public String greeting() {
        return "Hello, World!";
    }

    @GetMapping("/great/{name}")
    public String greetingWithName(@PathVariable String name) {
        String firstLetter = name.substring(0, 1).toUpperCase();
        return "Welcome, " + firstLetter + name.substring(1)+ "!";
    }

}
