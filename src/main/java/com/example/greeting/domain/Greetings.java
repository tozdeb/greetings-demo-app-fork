package com.example.greeting.domain;

import org.springframework.stereotype.Service;

@Service
public class Greetings implements Cloneable {

    public String officialGreeting(String name) {
        return "Hello " + name;
    }

    public String casualGreeting(String name) {
        return "Hi " + name;
    }
}
