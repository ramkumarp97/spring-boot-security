package com.premram.springbootsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {

    @GetMapping("say-hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World! from secure Spring Boot Security");
    }

    @GetMapping("/say-good-bye")
    public ResponseEntity<String> sayGoodBye() {
        return ResponseEntity.ok("Say GoodBye! from secure Spring Boot Security");
    }
}
