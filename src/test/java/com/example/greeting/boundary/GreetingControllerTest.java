package com.example.greeting.boundary;

import com.example.greeting.domain.Greetings;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;


import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(GreetingController.class)
class GreetingControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    Greetings greetings;

    @Test
    void shouldGreetCasually() throws Exception {
        given(greetings.casualGreeting("Joe"))
                .willReturn("Hi Joe");

        mvc.perform(get("/greetings/greeting")
                        .queryParam("name", "Joe"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hi Joe"));
    }
}