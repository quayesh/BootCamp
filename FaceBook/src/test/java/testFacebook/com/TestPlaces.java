package testFacebook.com;

import base.CommonAPI;
import facebook.com.Places;
import facebook.com.SignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPlaces extends CommonAPI {
    Places places;

    @BeforeMethod
    public void inti() {
        places = PageFactory.initElements(driver, Places.class);
    }

    @Test
    public void clickOnPlaces() {
        places.clickOnPlaces();
    }

    @Test
    public void clickNewYork() {
        places.clickNewYork();
    }

    @Test
    public void clickLosAngeles() {
        places.clickLosAngeles();
    }

    @Test
    public void clickLasVegas() {
        places.clickLasVegas();
    }

    @Test
    public void clickChicago() {
        places.clickChicago();
    }
}
