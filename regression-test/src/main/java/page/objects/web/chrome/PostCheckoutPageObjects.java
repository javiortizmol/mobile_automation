package page.objects.web.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PostCheckoutPageObjects {
	
	public PostCheckoutPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="merchantId")
	public WebElement MerchantId;
	
	@FindBy(name="accountId")
	public WebElement AccountId;

	@FindBy(xpath="//*[@id=\"datos_pago\"]/table/tbody/tr[4]/td[2]/input")
	public WebElement Description;
	
	@FindBy(xpath="//*[@id=\"datos_pago\"]/table/tbody/tr[6]/td[2]/input")
	public WebElement Ammount;
	
	@FindBy(xpath="//*[@id=\"datos_pago\"]/table/tbody/tr[11]/td[2]/select")
	public WebElement Currency;
	
	public void select_currency (String currencyOption) {
		Select ListCurrency = new Select(Currency);
		ListCurrency.selectByVisibleText(currencyOption);
	}
	
	@FindBy(name="Submit")
	public WebElement SubmitTransaction;
	
}
