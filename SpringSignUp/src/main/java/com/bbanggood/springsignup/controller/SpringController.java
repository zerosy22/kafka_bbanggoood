package com.bbanggood.springsignup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @GetMapping("/user/hello")
    public String Hello() {
        return "Hello";
    }
}