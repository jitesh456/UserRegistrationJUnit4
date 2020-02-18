package com.userregistration;

public class UserRegistration {
    String nameValidation="^[A-Z]{1}[a-z]{2,}";
    String emailValidate= "^[a-zA-Z]{3,}([-|+|.|_]?[a-zA-Z0-9]+)?[@]{1}[A-Za-z0-9]+[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]+)?$";
    String validateNo="^[0-9]{1,3}[ ][0-9]{10}$";
    public Boolean validateName(String name) {
        return name.matches(nameValidation);
    }

    public Boolean validateEmail(String email) {
        return email.matches(emailValidate);
    }

    public Boolean validatePhoneNo(String phoneNo) {
        return phoneNo.matches(validateNo);
    }
}
