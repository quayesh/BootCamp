package facebook.com;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Places extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_2\"]/ul/li[10]/a")
    WebElement CP;
    @FindBy(linkText = "NewYork")
    WebElement NY;
    @FindBy(linkText = "Los Angeles, California")
    WebElement LA;
    @FindBy(linkText = "Las Vegas, Nevada")
    WebElement LV;
    @FindBy(linkText = "Chicago, Illinois")
    WebElement CI;


    public void clickOnPlaces() {
        CP.click();
    }

    public void clickNewYork() {
        NY.click();
    }

    public void clickLosAngeles() {
        LA.click();
    }

    public void clickLasVegas() {
        LV.click();
    }

    public void clickChicago() {
        CI.click();
    }

}
