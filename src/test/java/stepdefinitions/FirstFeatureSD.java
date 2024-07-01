package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class FirstFeatureSD {
    GooglePage gp = new GooglePage();

    @Given("kullanici google sayfasina gider")
    public void kullaniciGoogleSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        gp.handleCookies();
    }

    @When("kullanici samsung icin arama yapar")
    public void kullaniciSamsungIcinAramaYapar() {
        gp.searchFor("samsung");
    }

    @Then("sayfa basliginin samsung kelimesi icerdigini test eder")
    public void sayfaBasligininSamsungKelimesiIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @When("kullanici cucumber icin arama yapar")
    public void kullaniciCucumberIcinAramaYapar() {
        gp.searchFor("cucumber");
    }


    @Then("sayfa basliginin cucumber kelimesi icerdigini test eder")
    public void sayfaBasligininCucumberKelimesiIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));
    }

    @Then("sayfa basliginin java kelimesi icerdigini test eder")
    public void sayfaBasligininJavaKelimesiIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("java"));
    }

    @When("kullanici java icin arama yapar") // burada siralam önemli degil
    public void kullaniciJavaIcinAramaYapar() {
        gp.searchFor("java");
    }
}
