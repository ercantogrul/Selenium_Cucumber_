package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class Hwork07SD {
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int arg0) {
        Actions action = new Actions(Driver.getDriver());
        action.pause(arg0);
    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));
    }
}
