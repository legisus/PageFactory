import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTest{

    public static final String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1";

    @Test
    public void checkAddToCart(){
        getHomePage().clickProductCatalogButton();
        getHomePage().clickAppleStoreButton();
        getAppleStorePage().clickIphoneButton();
        getIphonePage().waiter(30);
        getIphonePage().clickAddToCartButton();
        getIphonePage().waitVisibilityOfElement(30, getIphonePage().getAddToCartPopup());
        getIphonePage().clickContinueShoppingButton();

        assertEquals(getHomePage().getTextOfAmountProductsInCart(), "1");


    }
}
