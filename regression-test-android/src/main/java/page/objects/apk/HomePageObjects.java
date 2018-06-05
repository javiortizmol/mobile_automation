package page.objects.apk;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObjects  {
	
	
	public HomePageObjects(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public HomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]")
	public WebElement DataButton;
	
	public void goToAndroidPlace(WebDriver driver, String place) {
		if ( place != null) {
			if ( place == "HOME") {
				((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.HOME);
			}
			if ( place == "BACK") {
				((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.BACK);
			}
		}
		else {
			System.out.println("Var "+place+" not be null");
		}
	}

}
