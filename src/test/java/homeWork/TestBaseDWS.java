package homeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBaseDWS {
    static WebDriver driver;

    public static void enterData(String email, String password) {
        driver.findElement(By.name("Email")).sendKeys(email);
        driver.findElement(By.name("Password")).sendKeys(password);
    }

    public static void moveToOrders() {
        driver.findElement(By.cssSelector(".cart-label")).click();
    }

    public static void addElementToCart() {
        driver.findElement(By.cssSelector("#add-to-cart-button-74")).click();
    }

    public static void selectItemClick() {
        driver.findElement(By.cssSelector("[href='/build-your-own-expensive-computer-2']")).click();
    }

    //    @BeforeMethod
    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
//    @AfterMethod(enabled = false)
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
    public boolean isAlertPresent() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        } else {
            alert.accept();
            return true;
        }
    }
    public  boolean isElementPresent(By locator) {
        return !driver.findElements(locator).isEmpty();
    }

    public void clickOnLoginButton() {
        driver.findElement(By.xpath("//button[.='Log in']")).click();
    }

    public boolean isElementPresent() {
        return isElementPresent(By.cssSelector("[href='/register']"));
    }

    public void fillRegistrationForm(User user) {
        driver.findElement(By.cssSelector(user.getGenderChoose())).click();

        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys(user.getName());

        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys(user.getLastname());

        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys(user.getEmail());

        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys(user.getPassword());

        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys(user.getPassword());
    }

    public void clickOnRegisterLink() {
        driver.findElement(By.cssSelector("[href='/register']")).click();
    }

    public void clickOnRegisterUser() {
        driver.findElement(By.cssSelector("#register-button")).click();
    }

    public void clickOnLogoutButton() {
        driver.findElement(By.xpath("//button[.='Log out']")).click();
    }

    public boolean clickOnLoginLink() {
        return isElementPresent(By.cssSelector("[href='/login']"));
    }

    public void LoginUser() {
        driver.findElement(By.cssSelector(".button-1.login-button")).click();
    }

    public void fillAllData(String email, String password) {
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys(email);
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys(password);
        driver.findElement(By.cssSelector("[for='RememberMe']")).click();
    }

    public void clickOnLogin() {
        driver.findElement(By.cssSelector("[href='/login']")).click();
    }

    public boolean isIcoElementPresent() {
        return isElementPresent(By.cssSelector(".ico-logout"));
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

    public void addItems() {
        driver.findElement(By.cssSelector(".product")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        driver.navigate().back();
    }
}
