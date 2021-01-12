package com.free.guifei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.free.guifei")
@MapperScan("com.free.guifei.samples.quickstart.mapper")
public class GuifeiMangoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuifeiMangoApplication.class, args);
    }
}
