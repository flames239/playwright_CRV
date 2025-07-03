package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "step_definitions",
        tags = "",
        plugin = {"pretty","json:target/cucumber.json","html:target/cucumber-report.html"}
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}
