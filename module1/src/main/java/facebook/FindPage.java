package facebook;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class FindPage extends CommonAPI {
    @FindBy(name = "firstname")
    WebElement FN;
    @FindBy(name = "lastname")
    WebElement LN;

    public void enterFirstName() {
        FN.submit();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify button");
        driver.navigate().to("https://www.facebook.com");
    }

    public void setLastName() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify the name");
        LN.sendKeys("LastName");
        setLastName();
        String ActualURL = driver.getCurrentUrl();

        String ExpectedURL = "https://www.messenger.com/";
        Assert.assertEquals(ActualURL, ExpectedURL);
        driver.navigate().back();

    }
}
