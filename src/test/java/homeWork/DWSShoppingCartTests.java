package homeWork;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DWSShoppingCartTests extends TestBaseDWS {

    @BeforeMethod
    public void ensurePrecondition() {
        if (isIcoElementPresent()) {
            clickOnLogoutButton();
        }

        clickOnLogin();
        enterData("userTest@gm.com", "U$er1234");
        LoginUser();

        Assert.assertTrue(isIcoElementPresent());
    }

    @Test
    public void addProductToCartPositiveTest() {
        selectItemClick();
        addElementToCart();
        pause(100);
        moveToOrders();
        int sizeBefore = sizeOfItems();
        addItems();
        int sizeAfter = sizeOfItems();

        Assert.assertEquals(sizeBefore, sizeAfter + 1);
    }


}
