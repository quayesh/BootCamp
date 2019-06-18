package mobile;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HybridApp extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getContext());
		driver.findElement(By.id("com.example.testapp:id/urlField")).sendKeys("http:/google.com");
		driver.findElement(By.id("com.example.testapp:id/goButton")).click();
		Set<String>s=driver.getContextHandles();
		for(String handle:s)
		{
			System.out.println(handle);
		}
		driver.context("WEBVIEW_com.example.testapp");
		driver.findElement(By.name("q")).sendKeys("HybridApp");

	}

}
