package homeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DWSCreateAccTest extends TestBaseDWS{
    @BeforeMethod
    public void checkElement() {
        if (!isElementPresent(By.cssSelector("[href='/register']"))){
            driver.findElement(By.xpath("//button[.='Log in']")).click();
        }
    }
    @Test
    public void registerUserTest() {
        driver.findElement(By.cssSelector("[href='/register']")).click();

        driver.findElement(By.cssSelector("[for='gender-male']")).click();

        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("UserName");

        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("UserSurname");

        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("userTest@gm.com");

        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("U$er1234");

        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("U$er1234");

        driver.findElement(By.cssSelector("#register-button")).click();

        Assert.assertTrue(isElementPresent(By.cssSelector(".master-wrapper-page:nth-child(4)")));
    }
}
