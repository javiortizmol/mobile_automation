package page.objects.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPageObjects {
	
	public ButtonsPageObjects(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Background Image\"]")
	public WebElement BackGroundImageSection;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Gray\"]")
	public WebElement GrayButton;
	
	
}
