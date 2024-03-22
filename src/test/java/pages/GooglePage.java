package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "APjFqb")
    WebElement searchBox;

    @FindBy(xpath = "(//div[@class='QS5gu sy4vM'])[2]")
    WebElement cookies;

    public void searchFor(String keyword){
        searchBox.sendKeys(keyword+ Keys.ENTER);
    }
    public void handleCookies(){
        try {
            if (cookies.isDisplayed()) {
                cookies.click();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
