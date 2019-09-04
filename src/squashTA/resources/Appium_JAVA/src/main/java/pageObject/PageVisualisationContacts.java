package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageVisualisationContacts extends AbstractClass {

	public PageVisualisationContacts(AndroidDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//private AndroidDriver<AndroidElement> driver;


	@AndroidFindBy(id="com.simplemobiletools.contacts:id/fragment_fab")
	private AndroidElement boutonAjouterContact;

	public PageCreationContact ajouterContact() {
		boutonAjouterContact.click();
		return new PageCreationContact(driver);

	}
	public PageContact selectContactCreated(String name) {
		AndroidElement contact = driver.findElementByXPath("//*[@text='"+name+"']");
		contact.click();
		return new PageContact(driver);

	}
}
