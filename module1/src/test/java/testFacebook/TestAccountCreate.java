package testFacebook;

import base.CommonAPI;
import facebook.AccountCreate;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAccountCreate extends CommonAPI {
    AccountCreate signUp;

    @BeforeMethod
    public void initLogIn() {
        signUp = PageFactory.initElements(driver,AccountCreate.class);
    }


    @Test(enabled = false)
    public void CreateAccount() {
        signUp.setFirstName("abm");
        signUp.setLastName("qua");
    }

    @Test
    public void HaveLogInLink() {
        signUp.setFirstName("abm");
        signUp.HaveLogInLink();
        Assert.assertEquals(signUp, "LogIn");
    }


}
