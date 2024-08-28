package com.mytests.spring.springboundedgenericsinjection;

import com.mytests.spring.springboundedgenericsinjection.generics.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBoundedGenericsInjectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoundedGenericsInjectionApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
                                               InjectMultiBoundGenericsListInConstructor injectGenericsListInConstructor,
                                               InjectMultiBoundGenericsInConstructorByTypeFooBarAndName injectGenericsInConstructor,
                                               InjectFewSingleBoundGenericsInConstructorByTypesFooAndBarAndName injectGenericsInConstructor2,
                                               InjectSingleBoundGenericInConstructorByTypeFooAndName injectSingleBoundGenericInConstructorByTypeFooAndName,
                                               InjectListOfSingleBoundGenericInConstructorByTypeFoo injectListOfSingleBoundGenericInConstructorByTypeFoo,
                                               InjectListOfListOfBoundedTypes injectListOfListOfGenerics) {
        return args -> {
            System.out.println("--------------------------------------");
            injectGenericsListInConstructor.displayMethod();
            injectGenericsInConstructor.displayMethod();
            injectGenericsInConstructor2.displayMethod();
            injectSingleBoundGenericInConstructorByTypeFooAndName.displayMethod();
            injectListOfSingleBoundGenericInConstructorByTypeFoo.displayMethod();
            injectListOfListOfGenerics.displayMethod();
            System.out.println("--------------------------------------");
        };
    }
}
