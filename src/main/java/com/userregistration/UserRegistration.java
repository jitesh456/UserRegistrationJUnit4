package com.userregistration;

public class UserRegistration {
    String nameValidation="^[A-Z]{1}[a-z]{2,}";
    String emailValidate= "^[a-zA-Z]{3,}([-|+|.|_]?[a-zA-Z0-9]+)?[@]{1}[A-Za-z0-9]+[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]+)?$";
    String validateNo="^[0-9]{1,3}[ ][0-9]{10}$";
    String validatePasswordMinmumCharacter="^[a-zA-Z]{8,}";
    String validatePasswordUpperCase="((?=.*[A-Z])(?=.*[a-z])).{8,}";
    String validatePasswordDigit="((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])).{8,}";
    String validatePasswordSpecial="((?=.*[A-Z])(?=.*[a-z])(?=.*[@#$!%].)(?=.*[0-9])).{8,}";
    public Boolean validateName(String name) {
        return name.matches(nameValidation);
    }

    public Boolean validateEmail(String email) {
        return email.matches(emailValidate);
    }

    public Boolean validatePhoneNo(String phoneNo) {
        return phoneNo.matches(validateNo);
    }

    public Boolean validatePassword(String password) {
        return password.matches(validatePasswordMinmumCharacter);
    }

    public Boolean validatePasswordForUpper(String password) {
        return password.matches(validatePasswordUpperCase);
    }


    public Boolean validatePasswordForNumber(String password) {
        return password.matches(validatePasswordDigit);
    }

    public Boolean validatePasswordSpecialCharacter(String password) {
        return password.matches(validatePasswordSpecial);
    }
}
