package pagesObjects;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class BaseTestSuite {

    protected static WebDriver driver;
    private static WebDriverWait ewait;

    private static String browserType = "Firefox";

    static {

        if (browserType.equals("Chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            driver = new ChromeDriver(chromeOptions);


        } else if (browserType.equals("Firefox")) {
            FirefoxOptions firefoxOptions= new FirefoxOptions();
            driver= new FirefoxDriver(firefoxOptions);
        }
        driver.manage().window().maximize();
    }

    public BaseTestSuite(WebDriver driver) {
        BaseTestSuite.driver = driver;
        ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement findElement(By locator) {
        return ewait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickOnElement(By locator) {
        findElement(locator).click();
    }

    public void type(By locator, String message) {
        findElement(locator).sendKeys(message);
    }

    public String getTextFromElement(By locator) {
        return findElement(locator).getText();
    }

    public boolean isTheElementDisplayed(By locator) {
        return findElement(locator).isDisplayed();
    }

    public void clickOnElementInList(By locator, int position) {
        List<WebElement> list = driver.findElements(locator);
        list.get(position).click();
    }

    public static void tearDownBrowser() {
        driver.quit();
    }

    public static void getScreenShot(String nameTest) throws IOException {

        DateFormat formatDate = new SimpleDateFormat("dd-MM-yy-HH-mm-ss-SS");
        Date date = new Date();
        String dateScreenShot = formatDate.format(date);

        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f, new File("C://Users//jtrejos//IdeaProjects//project_pom_Cucumber//src//test//resources//screenShots//" + nameTest + "_" + dateScreenShot + ".jpg"));
    }

}
