package mobile.automation.regression.test;

import static org.testng.Assert.assertEquals;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import page.objects.apk.DataManagerPageObjects;
import page.objects.apk.HomePageObjects;



public class SmokeTest_Apk_WebDriver 
{
	private WebDriver driver;

	@BeforeClass

	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "test-demo");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("app", "/Users/javier.ortiz/Documents/apps/android/agendadigital.apk");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void test_apk_using_RemoteDriver() throws Throwable {
		
		HomePageObjects homePage = new HomePageObjects(driver);
		DataManagerPageObjects dataPage = new DataManagerPageObjects(driver);
		
		String expectedMessage="This feature can be useful in the following situations:";
		String expectedConfirmationMessaggeNameSaved="A copy of the data has been saved to TestCases";
		Thread.sleep(4000);
		
		//Click on Data Buttom from App Home
		homePage.DataButton.click();
		
		//Check the main Data Form Text Message
		Assert.assertEquals(dataPage.MainTextMessageDataManagerForm.getText(),expectedMessage);

		//Go to next Page Of Data
		dataPage.ContinuePage.click();
		
		//Go to Copy Of Data Option
		dataPage.CopyOfDataOption.click();
		
		//Enter name on Widget Name and Click on OK Button
		dataPage.WidgetEnterName.sendKeys("TestCases");
		dataPage.WidgetEnterNameOkButton.click();
		
		//Check if the name was saved correctly and then click on Ok Button
		Assert.assertTrue(dataPage.WidgetEnterConfirmationMessaggeSaveName.getText().contains(expectedConfirmationMessaggeNameSaved));
		dataPage.WidgetEnterConfirmationMessaggeSaveNameOkButton.click();
				
			
	}

	
	
}

