package homeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DWSShoppingCartTests extends TestBaseDWS {

    @BeforeMethod
    public void ensurePrecondition() {
        if (isElementPresent(By.cssSelector(".ico-logout"))) {
            driver.findElement(By.xpath("//button[.='Log out']")).click();
        }

        driver.findElement(By.cssSelector("[href='/login']")).click();

        driver.findElement(By.name("Email")).sendKeys("userTest@gm.com");
        driver.findElement(By.name("Password")).sendKeys("U$er1234");

        driver.findElement(By.cssSelector(".button-1.login-button")).click();

        Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));
    }

    @Test
    public void addProductToCartPositiveTest() {
        driver.findElement(By.cssSelector("[href='/build-your-own-expensive-computer-2']")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button-74")).click();
        pause(100);
        driver.findElement(By.cssSelector(".cart-label")).click();
        int sizeBefore = sizeOfItems();
        addItems();
        int sizeAfter = sizeOfItems();

        Assert.assertEquals(sizeBefore, sizeAfter + 1);
    }

    public void addItems() {
        driver.findElement(By.cssSelector(".product")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        driver.navigate().back();
    }


    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int sizeOfItems() {

        if (isElementPresent(By.cssSelector(".cart-qty"))) {
            return Integer.parseInt(driver.findElement(By.cssSelector(".cart-qty")).getText());
        }
        return 0;
    }
}
