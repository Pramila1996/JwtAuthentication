package com.fresco.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.fresco.ecommerce.repo")
@EntityScan(basePackages = "com.fresco.ecommerce.models")
public class JwtAuthentication {

    public static void main(String[] args) {
        SpringApplication.run(JwtAuthentication.class, args);
    }

}
