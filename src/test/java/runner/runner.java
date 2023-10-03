package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import pagesObjects.*;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepsDefinition",
        tags = "@Login",
        plugin = {"pretty","html:src/test/resources/reports/cucumber-html-report.html"})


public class runner {

    @BeforeClass
    public static void beforeClass() {

    }

    @AfterClass
    public static void tearDown() {
            BaseTestSuite.tearDownBrowser();
    }
}
