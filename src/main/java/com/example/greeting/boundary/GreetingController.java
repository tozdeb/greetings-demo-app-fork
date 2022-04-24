package com.example.greeting.boundary;

import com.example.greeting.domain.Greetings;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final Greetings greetings;

    GreetingController(Greetings greetings) {
        this.greetings = greetings;
    }

    @GetMapping("greetings/welcome")
    ResponseEntity<?> greetOfficially(@RequestParam("name") Optional<String> name) {
        String greeting = greetings.officialGreeting(name.orElse("World"));
        return ResponseEntity.ok(greeting);
    }

    @GetMapping("greetings/greeting")
    ResponseEntity<?> greetCasually(@RequestParam("name") Optional<String> name) {
        String greeting = greetings.casualGreeting(name.orElse("World"));
        return ResponseEntity.ok(greeting);
    }
}
