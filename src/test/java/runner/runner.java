package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepsDefinition",
        tags = "@Login",
        plugin = {"pretty","html:src/test/resources/reports/cucumber-html-report.html"})
public class runner {
}
