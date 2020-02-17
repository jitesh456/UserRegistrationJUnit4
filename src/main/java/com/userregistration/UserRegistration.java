package com.userregistration;

public class UserRegistration {
    String VALIDATION_NAME = "^[A-Z]{1}[a-z]{2,}";
    public Boolean validateName(String name) {
        return name.matches(VALIDATION_NAME);
    }
}
