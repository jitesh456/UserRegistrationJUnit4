package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest{
    UserRegistration registration = new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ReturnTrue() {

        Boolean result = registration.validateFirstName("Jitesh");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ReturnFalse() {

        Boolean result= registration.validateFirstName("ji");
        Assert.assertEquals(false,result);
    }
}
