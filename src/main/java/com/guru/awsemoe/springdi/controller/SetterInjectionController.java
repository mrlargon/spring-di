package com.guru.awsemoe.springdi.controller;

import com.guru.awsemoe.springdi.services.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {
    @Autowired
    private Greetings greetings;

    public void setGreetings(Greetings greetings) {
        this.greetings = greetings;
    }

    public String sayHelloWorld() {
        return greetings.sayGreeting();
    }
}
