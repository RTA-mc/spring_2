package com.spring_restaurant.restaurant_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.spring_restaurant.restaurant_spring")
public class RestaurantSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantSpringApplication.class, args);
    }
}