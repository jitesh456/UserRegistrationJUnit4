package com.userregistration;

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
}
