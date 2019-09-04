package pageObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageContact extends AbstractClass{

	public PageContact(AndroidDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_first_name")
	private AndroidElement champFirstName;
	@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_number")
	private AndroidElement champNumber;
	@AndroidFindBy(id="com.simplemobiletools.contacts:id/contact_email")
	private AndroidElement champEMail;
	public String recupValueOfName () {
		String resultat = champFirstName.getText();

		return resultat;

	}
	public String recupValueOfNumber () {
		String resultat = champNumber.getText();

		return resultat;

	}
	public String recupValueOfEmail () {
		String resultat = champEMail.getText();

		return resultat;

	}




}
