package cnn;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageCnn extends CommonAPI {

    @FindBy(id = "alert-box-message")
    WebElement home;
    @FindBy(linkText = "World")
    WebElement wod;
    @FindBy(id = "logo")
    WebElement cnn;


    public void setHome() {
        home.sendKeys("cnn");
    }

    public void clickWorldButton() {
        wod.click();
    }

    public void cnnButton() {
        cnn.click();
    }
}





