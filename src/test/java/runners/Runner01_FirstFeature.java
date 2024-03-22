package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // buraya resources in altindaki "features" file in CONTENT ROOT U yazilir
        //1- Gherkin dilinde yazilmis senaryolari aliriz
        glue = "stepdefinitions"      //buraya stepdefinition package'nın SOURCE ROOT'u yazılır.
        //2-java kodlari olarak iplement ettigimiz package

        // dryRun = true
                    //4- Testi test ediyor ve eksik step defination varsa onlari bize gösterir
                    // bu kod aktif iken kodlarimizda hata olup olmadigini kontrol eder (smilasyonu yapar),
                    // hata yoksa bu kodu pasiy yapip testi kostururuz
)
public class Runner01_FirstFeature extends AbstractTestNGCucumberTests {
}
