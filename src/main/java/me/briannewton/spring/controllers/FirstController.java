package me.briannewton.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {

    @GetMapping("/first")
    public String first() {
        return "My First Spring Boot App!";
    }

    @GetMapping("/second")
    public String second() {
        return "My Second Spring Boot App!";
    }
}
