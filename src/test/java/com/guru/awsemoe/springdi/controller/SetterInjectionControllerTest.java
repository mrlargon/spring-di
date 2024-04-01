package com.guru.awsemoe.springdi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectionControllerTest {
    @Autowired
    SetterInjectionController setterInjectionController;

    @Test
    void sayHelloWorld() {
        System.out.println(setterInjectionController.sayHelloWorld());
    }
}