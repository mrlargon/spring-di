package com.guru.awsemoe.springdi.controller;
import com.guru.awsemoe.springdi.services.Greetings;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private final Greetings greetings;
  // Hämta basen inte primary
    public ConstructorInjectionController(@Qualifier("greetingsImpl") Greetings greetings) {
        this.greetings = greetings;
    }
    public String sayHello() {
        return  greetings.sayGreeting();
    }
}
