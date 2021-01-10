package com.free.guifei.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guifei")
public class FirstMangoController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello world";
    }
}
