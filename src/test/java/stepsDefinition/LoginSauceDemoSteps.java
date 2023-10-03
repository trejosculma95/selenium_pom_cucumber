package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.Utility;

import static org.junit.Assert.assertTrue;

public class LoginSauceDemoSteps extends Utility {

    @Given("^I am in the initial page$")
    public void navigateToSaucePage() {
        loginPage.vistitLoginPage("https://www.saucedemo.com/");
    }

    @When("^I want to log in the webpage with (.+) and (.+)$")
    public void loginIntoSaucePage(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("^I should join the Sauce Demo page$")
    public void checkTheCartBag() {
        assertTrue(productsPage.validateLoginSuccess());
    }

}
