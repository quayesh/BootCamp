package facebook;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AccountCreate extends CommonAPI {
    @FindBy(id = "email")
    WebElement signup;
    @FindBy(id = "pass")
    WebElement password;
    @FindBy(id = "Log In")
    WebElement logIn;

    public void SignUp() {
        signup.sendKeys("email");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.navigate().to("https://facebook.com");
    }

    public void SignUp(String username, String useremail, String userpassword) {
        password.sendKeys("pass");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

    }

    public String HaveLogInLink() {
        logIn.click();
        String title = driver.getTitle();
        return title;
    }


}
