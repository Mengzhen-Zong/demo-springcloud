package com.example.serviceeureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class ServiceEurekaApplication {

    @Value("${output}")
    private String output;

    @GetMapping("/")
    public String home() {
        return output;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceEurekaApplication.class, args);
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
