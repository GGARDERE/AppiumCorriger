package pageObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageCreationContact extends AbstractClass{

	public PageCreationContact(AndroidDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_first_name")
	private AndroidElement champFirstName;
	@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_number")
	private AndroidElement champNumber;
	@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_email")
	private AndroidElement champEmail;
	@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_toggle_favorite")
	private AndroidElement boutonFavori;
	@AndroidFindBy(accessibility="Save")
	private AndroidElement boutonSave;

	public PageContact remplirContact(String nom, String number, String email) {
		boutonFavori.click();
		champFirstName.sendKeys(nom);
		champNumber.sendKeys(number);
		champEmail.sendKeys(email);
		boutonSave.click();
		return new PageContact(driver);
	}
}
