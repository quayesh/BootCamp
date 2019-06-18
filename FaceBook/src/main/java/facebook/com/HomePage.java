package facebook.com;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    @FindBy(id = "email")
    WebElement emailBox;
    @FindBy(name = "pass")
    WebElement password;
    @FindBy(xpath = "//input[@value='Log In']")
    WebElement clickLogIn;
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[1]/div[1]/div[2]/span[1]")
    WebElement markOnSeePhotosAndUpdates;
    @FindBy(linkText = "findMore")
    WebElement findMore;

    public void setEmailBox() {
        emailBox.sendKeys("abm");

    }

    public void setMarkOnSeePhotosAndUpdates(){
        markOnSeePhotosAndUpdates.click();
    }

    public void setPassword() {
        password.sendKeys("1234");
        sleepFor(3);

    }

    public void clickLogIn() {
        clickLogIn.click();
    }

    public void setFindMore(){
        findMore.click();
    }

}



