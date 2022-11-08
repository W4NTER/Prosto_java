package com.example.annotation_config;

import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Pet {
    private String name;
    public void say(){
        System.out.println("Bow-Wow" + "\n");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Dog: init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }

    public Dog() {
        System.out.println("Bean Dog is created");
    }
}

