package com.example.xml_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext ("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callPet();

        System.out.println(person.getSurname());
        System.out.println("My age: " + person.getAge());

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        System.out.println(myDog.getName());
        myDog.say();
        System.out.println(yourDog.getName());
        myDog.say();
        context.close();
    }

}
