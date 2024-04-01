package com.guru.awsemoe.springdi.controller;

import com.guru.awsemoe.springdi.services.GreetingsImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PropertyInjectionControllerTest {
    @Autowired
    PropertyInjectionController propertyInjectionController;
/*    @BeforeEach
    void setUp() {
        propertyInjectionController  = new PropertyInjectionController();
        propertyInjectionController.greetings = new GreetingsImpl();

    }*/

    @Test
    void sayHelloWorld() {
        System.out.println(propertyInjectionController.sayHelloWorld());
    }
}