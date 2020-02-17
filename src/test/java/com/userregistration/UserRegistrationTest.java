package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest{
    UserRegistration registration = new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ReturnTrue() {

        Boolean result = registration.validateName("Jitesh");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ReturnFalse() {

        Boolean result= registration.validateName("ji");
        Assert.assertEquals(false,result);
    }

    @Test
    public void lastName_WhenProper_ReturnTrue() {
        Boolean result =registration.validateName();
    }
}
