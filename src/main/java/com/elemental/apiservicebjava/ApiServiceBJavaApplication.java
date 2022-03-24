package com.elemental.apiservicebjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ApiServiceBJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiServiceBJavaApplication.class, args);
    }

}
