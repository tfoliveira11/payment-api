package com.example.paymentapi.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PBKDF2PasswordTest {
    @Test
    public void shouldBeHashingPassword() {
        var password = PBKDF2Password.create("123456");
        Assertions.assertNotEquals("123456", password.value());
        Assertions.assertTrue(password.value().contains("$$".concat(password.salt())));
    }

    @Test
    public void shouldBeMatchesPassword() {
        var password = SHA1Password.create("123456");
        Assertions.assertTrue(password.validate("123456"));
    }
}