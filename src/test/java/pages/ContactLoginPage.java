package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactLoginPage {
  //  https://thinking-tester-contact-list.herokuapp.com/
  public ContactLoginPage(){  // @FindBy locatore almak icin Cosnstructor olusturmak ve icinede Driver i taminlamak lazim
      PageFactory.initElements(Driver.getDriver(),this);
  }

    @FindBy(id="email")
   public WebElement email;

    @FindBy(id="password")
   public WebElement password;

    @FindBy(id="submit")
   public WebElement submitButton;

    @FindBy(id="error")
   public WebElement errorMessage;

    @FindBy(id="add-contact")
    public WebElement addButton;

    @FindBy(id="signup")
    public WebElement signup;

    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id="add-contact")
    public WebElement addContact;

    @FindBy(id="city")
    public WebElement city;

    @FindBy(xpath="//td[.='ercan tgrl']")
    public WebElement verify;


    public void loginEmail(){
        email.sendKeys(Faker.instance().internet().emailAddress());
    }



}
