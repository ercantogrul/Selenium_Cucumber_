package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", //buraya feture file'ın CONTENT ROOT'u yazılır
        glue = "stepdefinitions", //buraya stepdefinition package'nın SOURCE ROOT'u yazılır.
        tags = "@amazonSearch"         //etiketi @background olanlari kosturur
        // dryRun = true              // bu kod aktif iken kodlarimizda hata olup olmadigini kontrol eder (smilasyonu yapar),
                                       // hata yoksa bu kodu pasiy yapip testi kostururuz
)
public class Runner04_Parameter extends AbstractTestNGCucumberTests {
}
