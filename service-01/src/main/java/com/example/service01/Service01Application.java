package com.example.service01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class Service01Application {

    @GetMapping("/")
    public String home() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service01Application.class, args);
    }
}
