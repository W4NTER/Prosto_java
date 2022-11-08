package com.example.java_code1_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.java_code1_config")
@PropertySource("classpath:application.properties")
public class MyConfig {
}
