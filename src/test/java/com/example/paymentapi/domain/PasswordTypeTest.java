package com.example.paymentapi.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTypeTest {

    @Test
    public void shouldBeCreatePlainPassword(){
        final var expectedPassword = "123456";
        final var password = PasswordType.PLAIN.create(expectedPassword);
        Assertions.assertTrue(password.validate(expectedPassword));
    }

}