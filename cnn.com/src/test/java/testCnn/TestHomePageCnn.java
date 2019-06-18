package testCnn;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePageCnn extends CommonAPI {
    TestHomePageCnn home;



    @BeforeMethod
    public void inti() {
        home = PageFactory.initElements(driver, TestHomePageCnn.class);
    }

    @Test
    public void clickWorldButton(){
        home.clickWorldButton();
    }

    @Test
    public void testSetHome() {
        home.testSetHome();
    }
    @Test
    public void setCnn(){
        home.setCnn();
    }

    @Test
    public void testSetHome1() {
    }

    @Test
    public void testClickWorldButton1() {
    }

    @Test
    public void testCnnButton() {
    }
}
