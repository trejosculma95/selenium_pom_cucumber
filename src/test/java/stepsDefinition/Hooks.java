package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Scenario;
import org.junit.BeforeClass;
import pagesObjects.BaseTestSuite;

import java.io.IOException;

public class Hooks {

    @BeforeClass
    public static void beforeClass() {
    }

    @AfterAll
    public static void tearDown() {
        BaseTestSuite.tearDownBrowser();
    }

    @After
    public static void getScreenShotOnFailure(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
        BaseTestSuite.getScreenShot(scenario.getName());
        }
    }
}
