package com.guru.awsemoe.springdi.controller;

import com.guru.awsemoe.springdi.services.Greetings;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final Greetings greetings;

    public MyController(Greetings greetings) {
        this.greetings = greetings;
    }

    public String sayHello() {
        System.out.println("Hi ");
      return greetings.sayGreeting();
    }
}
