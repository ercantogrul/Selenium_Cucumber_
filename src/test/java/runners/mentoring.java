package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // buraya resources in altindaki "features" file in CONTENT ROOT U yazilir
        glue = {"stepdefinitions","hooks"},  // buraya  "stepdefinitions" file in SOURCE ROOT U yazilir
        tags = "@homework"
       // dryRun = true
)
public class mentoring extends AbstractTestNGCucumberTests {
}
