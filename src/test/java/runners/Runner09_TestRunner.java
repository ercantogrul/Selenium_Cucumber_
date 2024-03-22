package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", //konsol ciktilarinin daha okunakli olmasi icin plugin
                "html:target/reports/html_reports/cucumber.html", //html formatinda rapor almak icin kullanilan plugin
                "json:target/reports/json-reports/cucumber1.json", //json formatinda rapor almak icin kullanilan plugin
                "junit:target/reports/xml-reports/cucumber1.xml",  //xml formatinda rapor almak icin kullanilan plugin
                "rerun:target/reports/failed-reports/failed1.txt", //failed testler için kullanilan plugin
        },
        monochrome = true,  // bu komut konsolu düzenliyor
        features = "src/test/resources/features", //buraya feture file'ın CONTENT ROOT'u yazılır
        glue = {"stepdefinitions","hooks"}, //buraya stepdefinition package'nın SOURCE ROOT'u yazılır.
        tags = "@validCredentials"
        //dryRun = true //default olarak false gelir. Yazmak zorunda değiliz ama kuru çalıştırmak istiyorsak TRUE olarak belirtmek zorundayız.

)
public class Runner09_TestRunner extends AbstractTestNGCucumberTests {
}
