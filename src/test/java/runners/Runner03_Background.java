package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // buraya resources in altindaki "features" file in CONTENT ROOT U yazilir
        glue = "stepdefinitions",  // buraya  "stepdefinitions" file in SOURCE ROOT U yazilir
        //  tags = "@firstFeature"       // etiketi @firstFeature olan  testler kosulur
        //  tags = "@samsung or @java"   // etiketi @samsung or @java olanlari  testler kosulur
        //   tags = "@firstFeature and not @java"   // java haric hepsini kosturur
        tags = "@background"         //etiketi @background olanlari kosturur
        // dryRun = true              // bu kod aktif iken kodlarimizda hata olup olmadigini kontrol eder (smilasyonu yapar),
                                     // hata yoksa bu kodu pasiy yapip testi kostururuz
)
public class Runner03_Background extends AbstractTestNGCucumberTests {
}
