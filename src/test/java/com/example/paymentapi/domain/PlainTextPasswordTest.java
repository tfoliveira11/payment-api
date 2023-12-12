package com.example.paymentapi.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlainTextPasswordTest {

    @Test
    public void shouldBeCreatePlainPassword(){
        final var expectedPassword = "123456";
        final var password = new PlainTextPassword(expectedPassword);
        Assertions.assertTrue(password.validate(expectedPassword));
    }
}