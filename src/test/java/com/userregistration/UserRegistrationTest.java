package com.userregistration;

import jdk.internal.jline.internal.TestAccessible;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest{
    UserRegistration registration = new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ReturnTrue() {

        Boolean result = registration.validateName("Rohit");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ReturnFalse() {

        Boolean result= registration.validateName("ro");
        Assert.assertEquals(false,result);
    }

    @Test
    public void lastName_WhenProper_ReturnTrue() {
        Boolean result =registration.validateName("Sharma");
        Assert.assertEquals(true,result);
    }

    @Test
    public void lastName_WhenNotProper_ReturnFalse() {
        Boolean result = registration.validateName("sh1");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenEmail_WhenProper_ReturnTrue() {
        Boolean result = registration.validateEmail("rahul@yahoo.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WhenNotProper_ReturnFalse()
    {
        Boolean result = registration.validateEmail("jitesh@.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPhoneNo_WhenProper_ReturnTrue() {
        Boolean result = registration.validatePhoneNo("91 9981233571");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNo_WhenNotProper_ReturnFalse() {
        Boolean result = registration.validatePhoneNo("998765479");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givePassword_WhenProper_ReturnTrue()
    {
        Boolean result = registration.validatePassword("jambojamb");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenNotProper_ReturnFalse()
    {
        Boolean result = registration.validatePassword("jambo");
        Assert.assertEquals(false,result);

    }

    @Test
    public void givenPasswordWithUpperCase_WhenProper_ReturnTrue() {
        Boolean result = registration.validatePasswordForUpper("UpperCase");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPasswordWithUpperCase_WhenNotProper_ReturnFalse() {
        Boolean result = registration.validatePasswordForUpper("lowercase");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPasswordWithNumber_WhenProper_ReturnTrue() {
        Boolean result = registration.validatePasswordForNumber("Bhuvan123");
        Assert.assertEquals(true,result);

    }

    @Test
    public void givenPasswordWithNumber_WhenNotProper_ReturnFalse() {
        Boolean result = registration.validatePasswordForNumber("Bhuvandas");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPasswordWithSpecialCharacter_WhenProper_Returntrue() {
        Boolean result = registration.validatePasswordSpecialCharacter("Bhuvhan@1");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPasswordWithSpecialCharacter_WhenNotProper_returnFalse()
    {
        Boolean result = registration.validatePasswordSpecialCharacter("Bhuvhan12");
        Assert.assertEquals(false,result);
    }
}
