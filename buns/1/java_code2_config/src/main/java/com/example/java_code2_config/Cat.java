package com.example.java_code2_config;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{

    public void say() {
        System.out.println("Meow-Meow" + "\n");

    }
}

