package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoWebShop {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(description = "Find elements by CSS selectors")
    public void findElementByCssSelectors() {
        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector(".topic-html-content-header"));
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector(".topic-html-content"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("[title='Notification']"));
        driver.findElement(By.cssSelector(".master-wrapper-content"));
        driver.findElement(By.cssSelector("[title='Error']"));
    }

    @Test(description = "Find elements by XPath")
    public void findElementByXpath() {
        driver.findElement(By.xpath("//*[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//*[@class='header-logo']"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));
        driver.findElement(By.xpath("//*[@class='topic-html-content-header']"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//*[@class='topic-html-content']"));
        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//*[@id='nivo-slider']"));
        driver.findElement(By.xpath("//*[@class='topic-html-content-body']"));
        driver.findElement(By.xpath("//*[@title='Error']"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
