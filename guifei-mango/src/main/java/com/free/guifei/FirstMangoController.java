package com.free.guifei;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/mango")
public class FirstMangoController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello world";
    }
}
