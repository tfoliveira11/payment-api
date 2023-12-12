package com.example.paymentapi.infrastructure.dto;

import com.example.paymentapi.domain.PasswordType;

public record CreateUserInput(String email, PasswordType passwordType, String password) {

}
