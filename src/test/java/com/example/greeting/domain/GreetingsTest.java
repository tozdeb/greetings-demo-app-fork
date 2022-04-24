package com.example.greeting.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetingsTest {

    Greetings greetings = new Greetings();

    @Test
    void shouldGreetOfficially() {
        String greeting = greetings.officialGreeting("Anna");

        assertThat(greeting).isEqualTo("Hello Anna");
    }
}