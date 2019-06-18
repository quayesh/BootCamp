package testFacebook.com;



import base.CommonAPI;
import facebook.com.SignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignUp extends CommonAPI {

    SignUp signUp;

    @BeforeMethod
    public void inti() {
        signUp = PageFactory.initElements(driver, SignUp.class);
    }

    @Test
    public void setSignUp() {
        signUp.setFirstName("abm");
        sleepFor(3);
    }

    @Test
    public void setSignUp1() {
        signUp.setLastName("Abm");

    }

    @Test
    public void setMobileNumber() {
        signUp.setMobileNumber();
    }

    @Test
    public void createNewPassword() {
        signUp.createNewPassword();
    }
    @Test
    public void markOnFemal(){
        signUp.markOnFemal();
    }


}
