package com.guru.awsemoe.springdi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ConstructorInjectionControllerTest {

@Autowired
ConstructorInjectionController controller;

    @Test
    void sayHello() {
        controller.sayHello();
    }
}