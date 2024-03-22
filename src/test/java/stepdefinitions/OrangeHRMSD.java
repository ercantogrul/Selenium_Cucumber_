package stepdefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.OrangeHRMPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Map;
public class OrangeHRMSD {

    OrangeHRMPage orange = new OrangeHRMPage();

    @Given("kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("orangeUrl"));
    }

    @And("kullanici username {string} girer")
    public void kullaniciUsernameGirer(String arg0) {
        Driver.getDriver().findElement(orange.usernameWE).sendKeys(arg0);
    }

    @And("kullanici password {string} girer")
    public void kullaniciPasswordGirer(String arg0) {
        Driver.getDriver().findElement(orange.passwordWE).sendKeys(arg0);
    }

    @And("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        Driver.getDriver().findElement(orange.loginButton).click();
    }

    @And("scenario fail olur")
    public void scenarioFailOlur() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(!Driver.getDriver().findElement(orange.errorMessagge).isDisplayed());
    }

    @When("kullanici credentiallari girer")
    public void kullaniciCredentiallariGirer(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> adminCredentials = dataTable.asMaps();
        for(Map<String, String> each : adminCredentials){
            Driver.getDriver().findElement(orange.usernameWE).sendKeys(each.get("username"));
            Driver.getDriver().findElement(orange.passwordWE).sendKeys(each.get("password"));
            Driver.getDriver().findElement(orange.loginButton).click();
            System.out.println(each);
        }
        Thread.sleep(2000);
    }

    @When("kullanici invalid credentiallari girer")
    public void kullaniciInvalidCredentiallariGirer(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> invalidCredentials = dataTable.asMaps();
        for(int i=0; i<invalidCredentials.size(); i++) {
            Driver.getDriver().findElement(orange.usernameWE).sendKeys(invalidCredentials.get(i).get("username"));
            Driver.getDriver().findElement(orange.passwordWE).sendKeys(invalidCredentials.get(i).get("password"));
            Driver.getDriver().findElement(orange.loginButton).click();
            Assert.assertTrue(Driver.getDriver().findElement(orange.errorMessagge).isDisplayed());
            System.out.println(invalidCredentials.get(i).get("username"));
        }
        Thread.sleep(2000);
    }
}
