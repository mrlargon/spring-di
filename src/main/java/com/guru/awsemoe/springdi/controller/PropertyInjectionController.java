package com.guru.awsemoe.springdi.controller;

import com.guru.awsemoe.springdi.services.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Autowired
    Greetings greetings;

    public String sayHelloWorld() {
        return greetings.sayGreeting();
    }
}
