package com.example.xml_config;

public class Dog implements Pet {
    private String name;
    public void say(){
        System.out.println("Bow-Wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        System.out.println("Bean Dog is created");
    }
}
