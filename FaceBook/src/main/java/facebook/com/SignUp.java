package facebook.com;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends CommonAPI {
    @FindBy(name = "firstname")
    WebElement FN;
    @FindBy(name = "lastname")
    WebElement LN;
    @FindBy(name = "reg_email__")
    WebElement MN;
    @FindBy(name = "reg_passwd__")
    WebElement NP;
    @FindBy(name="sex")
    WebElement MF;

    public void setFirstName(String abm) {

        FN.sendKeys("abm");
    }

    public void setLastName(String abm) {

        LN.sendKeys("Qua");
    }

    public void setMobileNumber() {
        MN.sendKeys("123456789");

    }

    public void createNewPassword() {

        NP.sendKeys("hello");
    }
    public void markOnFemal(){
        MF.click();
    }

    public void HaveLogInLink() {
    }
}
