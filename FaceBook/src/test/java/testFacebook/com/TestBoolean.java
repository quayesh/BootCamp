package testFacebook.com;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBoolean extends CommonAPI {
    String facebookUrl = "https://www.facebook.com";
    Boolean bl;

    @BeforeClass
    public void initialized() throws Exception {
        driver.get(facebookUrl);
        bl = PageFactory.initElements(driver, Boolean.class);
    }

    @AfterMethod
    public void reInit() {
        driver.get(facebookUrl);
    }

    @Test
    public void ClickNevada() throws Exception {
        boolean b = bl.booleanValue();
        driver.navigate().to(facebookUrl);
    }

    @Test
    public void ClickNewYork() throws Exception {
        bl.getClass();
    }

}
