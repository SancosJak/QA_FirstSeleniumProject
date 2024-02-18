package com.ait.qa30.homeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DWSCreateAccTest extends TestBaseDWS{
    @BeforeMethod
    public void checkElement() {
        if (!isElementPresent()){
            clickOnLoginButton();
        }
    }

    @Test
    public void registerUserTest() {
        clickOnRegisterLink();

        User user = new User();
        user.setGenderChoose("[for='gender-male']");
        user.setName("UserName");
        user.setLastname("UserSurname");
        user.setEmail("userTest@gm.com");
        user.setPassword("U$er1234");

        fillRegistrationForm(user);
        clickOnRegisterUser();

        Assert.assertTrue(isElementPresent(By.cssSelector(".master-wrapper-page:nth-child(4)")));
    }

}
