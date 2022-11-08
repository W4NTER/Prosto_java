package com.example.java_code2_config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.DOMErrorHandler;

public class JavaCode2ConfigApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        Dog myDog = context.getBean("dogBean", Dog.class);
        myDog.say();
        context.close();
    }

}
