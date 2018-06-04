package regression_test_ios.regression.test.ios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.objects.app.ButtonsPageObjects;
import page.objects.app.ControlsPageObjects;
import page.objects.app.MainPageObjects;


public class SmokeTest_web 
{
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//
		capabilities.setCapability("platformName", "IOS");
		capabilities.setCapability("deviceName", "iPhone 5s");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("browserName", "Safari");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
	@Test
	public void test_web_ios() throws Throwable {
		
		Thread.sleep(10000);
		driver.get("https://www.google.com");
			
	}
	
}