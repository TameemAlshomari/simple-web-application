package com.example.simplewebapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;
import java.util.Arrays;


@SpringBootApplication
public class SimpleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebApplication.class, args);
    }

    @Bean
    public CommandLineRunner CommandLineRunner(ApplicationContext ctx){
            return args -> {
              System.out.println("Lets inspect the beans run by spring boot");
              String [] beansNames = ctx.getBeanDefinitionNames();
              Arrays.sort(beansNames);
              for (String beansName :beansNames){
                  System.out.println(beansName);
              }
            };
    }
}
