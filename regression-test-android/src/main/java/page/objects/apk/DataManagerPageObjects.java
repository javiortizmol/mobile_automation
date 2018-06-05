package page.objects.apk;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class DataManagerPageObjects {

	public DataManagerPageObjects(AndroidDriver<WebElement> driverAndroid) {
		PageFactory.initElements(driverAndroid, this);
	}

	public DataManagerPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement MainTextMessageDataManagerForm;
	
	@FindBy(id="com.clawdyvan.agendadigitalaluno:id/btContinuar")
	public WebElement ContinuePage;

	@FindBy(id="com.clawdyvan.agendadigitalaluno:id/btFazerBackup")
	public WebElement CopyOfDataOption;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText")
	public WebElement WidgetEnterName; 
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	public WebElement WidgetEnterNameOkButton;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
	public WebElement WidgetEnterConfirmationMessaggeSaveName;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	public WebElement WidgetEnterConfirmationMessaggeSaveNameOkButton;
	
	//public AndroidDriver driverAndroid;
	
/*	public void goToHomeAndroid(AndroidDriver driverAndroid){

		driverAndroid.pressKeyCode(AndroidKeyCode.HOME);
		
	}*/
}
