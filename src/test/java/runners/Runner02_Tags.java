package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // buraya resources in altindaki "features" file in CONTENT ROOT U yazilir
        //1- Gherkin dilinde yazilmis senaryolari aliriz
        glue = "stepdefinitions",  // buraya  "stepdefinitions" file in SOURCE ROOT U yazilir
        //2-java kodlari olarak iplement ettigimiz package
        //  tags = "@firstFeature"       // etiketi @firstFeature olan  testler kosulur
        //  tags = "@samsung or @java"   // etiketi @samsung or @java olan  testler kosulur
        tags = "@firstFeature and not @java"   // java haric hepsini kosturur
        //3-run etmek istedigimiz tag in adi

        // dryRun = true
                     //4- Testi test ediyor ve eksik step defination varsa onlari bize gösterir
                     // bu kod aktif iken kodlarimizda hata olup olmadigini kontrol eder (smilasyonu yapar),
                     // hata yoksa bu kodu pasif yapip testi kostururuz
)
public class Runner02_Tags extends AbstractTestNGCucumberTests {
}
