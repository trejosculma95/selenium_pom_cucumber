package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartBagPage extends BaseTestSuite {

    By quantityOfItemsInCart = By.cssSelector(".shopping_cart_badge");

    public CartBagPage() {
        super(driver);
    }

    public int getQuantityOfItemsInCart() {
        return Integer.parseInt(getTextFromElement(quantityOfItemsInCart));
    }
}
