package com.ait.qa30.homeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DWSHomePageTests extends TestBaseDWS{
    @Test
    public void isHomeComponentPresentTest() {
        Assert.assertTrue(isHomeComponentPresent());
    }

    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector("div:nth-child(2)>div>div>h1"));
    }
}
