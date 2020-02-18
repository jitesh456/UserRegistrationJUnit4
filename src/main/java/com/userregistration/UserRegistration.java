package com.userregistration;

public class UserRegistration {
    String VALIDATION_NAME = "^[A-Z]{1}[a-z]{2,}";
    String VALIDATION_EMAIL = "^[a-zA-Z]{3,}([-|+|.|_]?[a-zA-Z0-9]+)?[@]{1}[A-Za-z0-9]+[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]+)?$";
    String VALIDATE_PHONE_NUMBER = "^[0-9]{1,3}[ ][0-9]{10}$";
    String VALIDATE_PASSWORD_MINIMUM_CHARACTER = "^[a-zA-Z]{8,}";
    String VALIDATE_PASSWORD_UPPER_CASE = "((?=.*[A-Z])(?=.*[a-z])).{8,}";
    String VALIDATE_PASSWORD_DIGIT = "((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])).{8,}";

    public Boolean validateName(String name) {
        return name.matches(VALIDATION_NAME);
    }

    public Boolean validateEmail(String email) {
        return email.matches(VALIDATION_EMAIL);
    }

    public Boolean validatePhoneNo(String phoneNo) {
        return phoneNo.matches(VALIDATE_PHONE_NUMBER);
    }

    public Boolean validatePassword(String password) {
        return password.matches(VALIDATE_PASSWORD_MINIMUM_CHARACTER);
    }

    public Boolean validatePasswordForUpper(String password) {
        return password.matches(VALIDATE_PASSWORD_UPPER_CASE);
    }


    public Boolean validatePasswordForNumber(String password) {
        return password.matches(VALIDATE_PASSWORD_DIGIT);
    }
}
