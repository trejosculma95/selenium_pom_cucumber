package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BaseTestSuite {
    public ProductsPage() {
        super(driver);
    }

    By firstTitleProduct = By.cssSelector("#item_4_title_link");
    By cartBag = By.cssSelector(".shopping_cart_link");

    By itemsToAdd = By.cssSelector(".btn_inventory");

    public boolean validateLoginSuccess() {
        return isTheElementDisplayed(firstTitleProduct);
    }

    public void goToCartBag() {
        clickOnElement(cartBag);
    }

    public void addToCartBagItem(int position) {
        clickOnElementInList(itemsToAdd, position - 1);
    }
}
