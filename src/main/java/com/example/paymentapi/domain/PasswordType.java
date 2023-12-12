package com.example.paymentapi.domain;

public class PasswordType {

    public static String create(String passwordType, String password) {
        Password passwordStrategy = new PlainTextPassword("123456");

        var plainPass = switch (passwordStrategy) {
            case PlainTextPassword(String value) -> value;
            case SHA1Password(String value) -> value;
        };

        return plainPass;
    }
}
