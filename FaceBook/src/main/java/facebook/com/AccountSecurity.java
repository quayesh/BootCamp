package facebook.com;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSecurity extends CommonAPI {
    @FindBy(linkText = "Account Security")
    WebElement AS;
    @FindBy(linkText = "Create Account")
    WebElement CA;
    @FindBy(linkText = "Friending")
    WebElement FD;
    @FindBy(linkText = "Your Home Page")
    WebElement HP;
    @FindBy(linkText = "Messaging")
    WebElement Mess;
    @FindBy(linkText = "Stories")
    WebElement Stor;
    @FindBy(linkText = "Photos")
    WebElement Photo;


    public void clickAccountSecurity() {
        AS.click();
    }

    public void clickCreateAccount() {
        CA.click();
    }

    public void clickFriending() {
        FD.click();
    }

    public void clickOnHomePage() {
        HP.click();
    }

    public void messagingButton() {
        Mess.click();
    }

    public void storiesButton() {
        Stor.click();
    }
    public void photoTab(){
        Photo.click();
    }

}
