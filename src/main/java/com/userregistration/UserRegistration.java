package com.userregistration;

public class UserRegistration {
    String nameValidation="^[A-Z]{1}[a-z]{2,}";
    public Boolean validateFirstName(String name) {
        return name.matches(nameValidation);
    }
}
