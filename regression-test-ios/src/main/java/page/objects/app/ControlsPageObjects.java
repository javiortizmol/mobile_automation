package page.objects.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ControlsPageObjects {
	
	public ControlsPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Standard Switch\"]")
	public WebElement StandardSwitchOption;

	@FindBy(xpath="//XCUIElementTypeSwitch[@name=\"Standard\"]")
	public WebElement StandardSwitchBotton;
}
