package com.ait.qa30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com"); // without history
       // driver.navigate().to("https://www.google.com"); //with history

        // extra option
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
    }

    @Test
    public void openGoogle(){
        System.out.println("Site opened!");
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit(); // close all browsers tabs
//        driver.close(); // close only one tab
    }
}
