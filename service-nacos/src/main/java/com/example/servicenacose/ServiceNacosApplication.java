package com.example.servicenacose;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ServiceNacosApplication {

    @Value("${output}")
    private String output;

    @GetMapping("/")
    public String home() {
        return output;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceNacosApplication.class, args);
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
