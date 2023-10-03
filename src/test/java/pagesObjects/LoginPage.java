package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseTestSuite {

    public LoginPage() {
        super(driver);
    }

    By inputUsername = By.id("user-name");
    By inputPwd = By.id("password");
    By btnLogin = By.id("login-button");

    public void login(String username, String pwd){
        type(inputUsername,username);
        type(inputPwd,pwd);
        clickOnElement(btnLogin);
    }

    public void vistitLoginPage(String url){
        driver.get(url);
    }


}
