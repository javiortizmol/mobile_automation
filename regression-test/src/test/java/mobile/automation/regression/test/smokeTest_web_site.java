package mobile.automation.regression.test;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class smokeTest_web_site 
{
	private WebDriver driver;

	@BeforeClass

	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//09fac6e0
		
		capabilities.setCapability("deviceName", "test-demo");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("browserName", "Browser");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
	}

	@AfterClass
	public void tearDown() throws Exception {
		//driver.quit();
	}
	
	@Test
	public void test_web_site() throws Throwable {
		driver.get("http://www.google.com");
		Thread.sleep(4000);
	}
	
}

