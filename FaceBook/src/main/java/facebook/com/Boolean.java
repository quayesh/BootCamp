package facebook.com;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Boolean extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_2\"]/ul/li[10]/a")
    WebElement CP;
    @FindBy(linkText = "NewYork")
    WebElement NY;


    public void nevada() {
        boolean bl = CP.isDisplayed();
        System.out.println("Nevada is displayed");
    }

    public void findNevada() {
        CP.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Check the button Nevada");
        driver.navigate().to("https://www.facebook.com");
    }

    public void clickNewYork() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Check the spelling");
        NY.sendKeys("New York");
        clickNewYork();

        boolean bl = NY.isDisplayed();
        System.out.println("NewYork is displayed");

    }

}