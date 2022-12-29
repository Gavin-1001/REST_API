package com.example.udemy_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class UdemyRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemyRestApiApplication.class, args);
    }

}
