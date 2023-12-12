package com.example.paymentapi.domain;

public sealed interface Password permits PBKDF2Password, PlainTextPassword, SHA1Password {
    String value();

    boolean validate(String password);
}
