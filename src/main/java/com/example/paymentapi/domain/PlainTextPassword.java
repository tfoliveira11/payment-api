package com.example.paymentapi.domain;

public record PlainTextPassword(String value) implements Password {

    @Override
    public boolean validate(String password) {
        return value().equals(password);
    }
}
