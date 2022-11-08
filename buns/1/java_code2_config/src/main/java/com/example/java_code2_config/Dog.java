package com.example.java_code2_config;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    private String name;
    public void say(){
        System.out.println("Bow-Wow" + "\n");
    }


    public Dog() {
        System.out.println("Bean Dog is created");
    }
}