package com.guru.awsemoe.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class GreetingsPrimeImpl implements Greetings {
    @Override
    public String sayGreeting() {
        return "Hello World Prim";
    }
}
