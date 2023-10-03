package stepsDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Utility;

import static org.junit.Assert.assertEquals;

public class sauceDemoSteps extends Utility {

   @Given("^I navigate to the sauce demo initial page$")
    public void navigateToSaucePage() {
        loginPage.vistitLoginPage("https://www.saucedemo.com/");
    }

    @When("^I login into the webpage with regular credentials$")
    public void loginIntoSaucePage() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @And("^I add some items to the cart$")
    public void addingItemsToCart() {
        productsPage.addToCartBagItem(1);
        productsPage.addToCartBagItem(2);
        productsPage.addToCartBagItem(6);
        productsPage.addToCartBagItem(3);
    }

    @Then("^I should see the added items on the cart$")
    public void checkTheCartBag() {
        productsPage.goToCartBag();
        assertEquals(4, cartBagPage.getQuantityOfItemsInCart());
    }

}
