package utilities;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pagesObjects.CartBagPage;
import pagesObjects.LoginPage;
import pagesObjects.ProductsPage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    WebDriver driver;
    protected LoginPage loginPage = new LoginPage();
    protected ProductsPage productsPage= new ProductsPage();
    protected CartBagPage cartBagPage= new CartBagPage();


}
