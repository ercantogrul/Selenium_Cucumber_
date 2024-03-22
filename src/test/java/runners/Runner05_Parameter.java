package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", //buraya feture file'ın CONTENT ROOT'u yazılır
        glue = "stepdefinitions", //buraya stepdefinition package'nın SOURCE ROOT'u yazılır.
        tags = "@sOutline",
        dryRun = false
)
public class Runner05_Parameter extends AbstractTestNGCucumberTests {
}
