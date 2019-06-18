package testFacebook.com;



import base.CommonAPI;
import facebook.com.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    TestHomePage homePage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, TestHomePage.class);
    }

    @Test(priority = 1)
    public void setEmailBoxTest() {

        homePage.setEmailBox();
    }

    private void setEmailBox() {
    }

    @Test
    public void setPasswordTest() {
        homePage.setPassword();
    }

    private void setPassword() {
    }

    @Test
    public void clickLogIn() {
        homePage.clickLogIn();

    }
    @Test
    public void markOnPhotosAndUpdates(){
        homePage.markOnPhotosAndUpdates();
    }
    @Test
    public void selectOnFindMore(){
        homePage.selectOnFindMore();
    }


}
