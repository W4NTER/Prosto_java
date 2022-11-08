package com.example.java_code1_config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCode1ConfigApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }

}
