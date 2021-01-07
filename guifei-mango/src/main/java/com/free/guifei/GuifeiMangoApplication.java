package com.free.guifei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(scanBasePackages = "com.free.guifei")
public class GuifeiMangoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuifeiMangoApplication.class, args);
    }
}
