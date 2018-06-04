package mobile.automation.regression.test;

import java.net.URL;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.objects.web.chrome.PostCheckoutPageObjects;



public class smokeTest_web_site 
{
	private WebDriver driver;

	@BeforeClass

	public void setUp() throws Exception {
		
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		options.addArguments("{args: ['--disable-popup-blocking']}");
		
		capabilities.setCapability("deviceName", "test-demo");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("chromedriverExecutable", "/usr/local/bin/chromeDriverExecutable/chromedriver");
		capabilities.setCapability("chromeOptions", options);
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
	}

	@AfterClass
	public void tearDown() throws Exception {
		//driver.quit();
	}
	
	
	
	@Test (description="Generating Baloto Voucher From Checkout")
	public void test_web_site_checkout_payu() throws Throwable {
		Thread.sleep(10000);
		driver.get("https://checkout.payulatam.com/ppp-web-gateway-payu/test/prueba_pago");
		
		//Constructor for PayU Latam Checkout PageObjects
		PostCheckoutPageObjects postForm = new PostCheckoutPageObjects(driver);
		
		String randomTextDescription = "TestCaseWebMobile" + RandomStringUtils.randomAlphanumeric(20).toUpperCase().toString();
		
		postForm.MerchantId.sendKeys("1");
		postForm.AccountId.sendKeys("1");
		postForm.Description.sendKeys(randomTextDescription);
		postForm.Ammount.sendKeys("200");
		postForm.select_currency("USD");
		postForm.SubmitTransaction.click();
		
	
	}
	
}

