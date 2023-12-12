package com.example.paymentapi.infrastructure.controller;

import com.example.paymentapi.domain.User;
import com.example.paymentapi.infrastructure.dto.CreateUserInput;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    public User create(@RequestBody CreateUserInput input) {

        return User.create(input.email(), input.passwordType(), input.password());
    }
}
