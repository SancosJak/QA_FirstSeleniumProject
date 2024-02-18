package com.ait.qa30.homeWork;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DWSLoginTests extends TestBaseDWS{
    @BeforeMethod
    public void ensurePrecondition() {
        if (!clickOnLoginLink()){
            clickOnLogoutButton();
        }
    }

    @Test
    public void loginPositiveTest() {

        clickOnLogin();
        fillAllData("userTest@gm.com", "U$er1234");
        LoginUser();

        Assert.assertTrue(isIcoElementPresent());
    }
    @Test
    public void loginNegativeTest() {

        clickOnLogin();
        fillAllData("userTest@gm.com", "U$er1234");
        LoginUser();
        Assert.assertTrue(isIcoElementPresent());
    }

}
