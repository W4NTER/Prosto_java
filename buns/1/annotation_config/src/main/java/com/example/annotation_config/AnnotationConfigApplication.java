package com.example.annotation_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext ("applicationContext.xml");

        Person person = context.getBean("person", Person.class);
        person.callPet();

        System.out.println(person.getSurname());
        System.out.println("My age: " + person.getAge());

        context.close();
    }

}
