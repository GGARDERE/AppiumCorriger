package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

abstract class AbstractClass {
	
	private static final Logger LOGGER = LoggerFactory.getLogger("LoggerClass");
	protected final AndroidDriver<AndroidElement> driver;
	
	
	public AbstractClass(AndroidDriver<AndroidElement> driver) {
		super();
		this.driver = driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private AndroidElement boutonAllow;
	//com.android.packageinstaller:id/
	public void accepterAccesTelephone() {
		AndroidElement boutonAccepter = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		boutonAccepter.click();
		
	}
	public void accepterAccesContact() {
		boutonAllow.click();
		
	}
	
}
