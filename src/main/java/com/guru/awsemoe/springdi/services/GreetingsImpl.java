package com.guru.awsemoe.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsImpl implements Greetings {
    @Override
    public String sayGreeting() {
        return "Hello World basement";
    }
}
