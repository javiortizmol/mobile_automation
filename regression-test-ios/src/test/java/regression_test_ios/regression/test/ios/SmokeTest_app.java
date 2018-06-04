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


public class SmokeTest_app 
{
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//
		capabilities.setCapability("platformName", "IOS");
		capabilities.setCapability("deviceName", "iPhone 5s");
		capabilities.setCapability("automationName", "XCUITest");
		//capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("app", "/Users/javier.ortiz/Documents/apps/ios/UICatalog.app");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
	@Test
	public void test_app_buttons() throws Throwable {
		
		String expectedSectionButtonsForm = "Background Image";
		
		//Main Constructors of PageObjects
		MainPageObjects homePage = new MainPageObjects(driver);
		ButtonsPageObjects buttonForm = new ButtonsPageObjects(driver);
		
		//Wait openning application
		Thread.sleep(10000);
		
		//Click on buttons option to access Button Form.
		homePage.Buttons.click();
	
		//Check backGround image section and then click on gray button.
		Assert.assertEquals(buttonForm.BackGroundImageSection.getText(),expectedSectionButtonsForm);
		buttonForm.GrayButton.click();
		
		
	}
	
	
	
	@Test(description="Test Case Form Controls")
	public void test_app_controls() throws Throwable {
		
		String expectedSectionControlsForm = "Standard Switch";
		
		//Main Constructors of PageObjects
		MainPageObjects homePage = new MainPageObjects(driver);
		ControlsPageObjects controlsForm = new ControlsPageObjects(driver);
		
		//Wait openning application
		Thread.sleep(10000);
		
		//Click on controls option to access Controls Form.
		homePage.Controls.click();
	
		//Click on switch button and then check th section name
		controlsForm.StandardSwitchBotton.click();
		Assert.assertEquals(controlsForm.StandardSwitchOption.getText(), expectedSectionControlsForm);
	
	}

}