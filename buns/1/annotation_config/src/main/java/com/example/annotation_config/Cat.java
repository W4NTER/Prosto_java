package com.example.annotation_config;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{

    public Cat() {
        System.out.println("Bean Cat is created");
    }
    public void say() {
        System.out.println("Meow-Meow" + "\n");
    }

}

