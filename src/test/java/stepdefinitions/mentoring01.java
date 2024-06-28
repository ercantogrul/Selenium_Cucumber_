package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ContactLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class mentoring01 {

    ContactLoginPage clp = new ContactLoginPage();

    @Given("goto home page")
    public void gotoHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("contactUrl"));
    }

    @When("enter invelid email")
    public void enterInvelidEmail() {
        clp.loginEmail();

    }

    @And("enter invalid password")
    public void enterInvalidPassword() {
        clp.password.sendKeys(Faker.instance().internet().password());
    }

    @And("click submit button")
    public void clickSubmitButton() {
        clp.submitButton.click();
    }

    @Then("verfy incorrectmessage")
    public void verfyIncorrectmessage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(clp.errorMessage.isDisplayed());
    }

    @And("close browser")
    public void closeBrowser() {
        Driver.closeDriver();
    }

    @When("enter email")
    public void enterEmail() {
        clp.email.sendKeys(ConfigReader.getProperty("c_email"));
    }

    @And("enter password")
    public void enterPassword() {
        clp.password.sendKeys(ConfigReader.getProperty("c_password"));
    }

    @Then("verfy correct addButton")
    public void verfyCorrectAddButton() {
        Assert.assertTrue(clp.addButton.isDisplayed());
    }

    @When("user enter valid userName {string}")
    public void userEnterValidUserName(String arg0) {
        clp.email.sendKeys(arg0);
    }

    @And("user enter valid password {string}")
    public void userEnterValidPassword(String arg0) {
        clp.password.sendKeys(arg0);
    }

    @When("contact page  click sign button")
    public void contactPageClickSignButton() {
        clp.signup.click();
    }

    @And("define new user")
    public void defineNewUser() {
        clp.firstName.sendKeys("ercan");
        clp.lastName.sendKeys("tgrl");
        clp.email.sendKeys("erc@gmail.com");
        clp.password.sendKeys("1234567");
        clp.submitButton.click();
    }

    @And("Add contact list")
    public void addContactList() {
        clp.addContact.click();
        clp.firstName.sendKeys("ercan");
        clp.lastName.sendKeys("tgrl");
        clp.city.sendKeys("Kocaeli");
        clp.submitButton.click();

    }

    @Then("verify user add table")
    public void verifyUserAddTable() {
        Assert.assertTrue(clp.verify.isDisplayed());
    }

    @When("enter emaila")
    public void enterEmaila() {
        clp.email.sendKeys("erc@gmail.com");
    }

    @And("enter passworda")
    public void enterPassworda() {
        clp.password.sendKeys("1234567");
    }
}
