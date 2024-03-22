package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", //buraya feture file'ın CONTENT ROOT'u yazılır
        glue = {"stepdefinitions","hooks"}, // buraya  "stepdefinitions" ve "hooks" file in SOURCE ROOT U yazilir
        tags = "@hooks",
        //dryRun = true
        dryRun = false
)
public class Runner07_HooksFailed extends AbstractTestNGCucumberTests {
}
