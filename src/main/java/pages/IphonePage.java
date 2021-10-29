package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IphonePage extends BasePage {

    private static final String ADD_TO_CART_BUTTON_LIST = "//a[@class='prod-cart__buy']";
    private static final String ADD_TO_CART_POPUP = "js_cart";
    private static final String CONTINUE_SHOPPING_BUTTON = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]";

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton(){
        driver.findElements(By.xpath(ADD_TO_CART_BUTTON_LIST)).get(0).click();
    }

    public By getAddToCartPopup(){
        return By.id(ADD_TO_CART_POPUP);
    }

    public void clickContinueShoppingButton(){
        driver.findElement(By.xpath(CONTINUE_SHOPPING_BUTTON)).click();
    }


}
