package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import pageObject.PageContact;
import pageObject.PageCreationContact;
import pageObject.PageVisualisationContacts;

public class PageObjectTest extends AbstratTest{
	private static final Logger LOGGER = LoggerFactory.getLogger("LoggerTest");
	public PageObjectTest() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void run() throws InterruptedException {
		
		//PageVisualisationContacts pageVisualisationContacts = PageFactory.initElements(driver, PageVisualisationContacts.class);
		PageVisualisationContacts pageVisualisationContacts = new PageVisualisationContacts(driver);
		pageVisualisationContacts.accepterAccesTelephone();
		pageVisualisationContacts.accepterAccesContact();
		PageCreationContact pageCreationContact =pageVisualisationContacts.ajouterContact();
		String nom="PremierContact";
		String number="0123456789";
		String email="azertyu.op@qsdfgh.fr";
		LOGGER.info("Envoi des informations dans les champs du contact");
		pageCreationContact.remplirContact(nom, number, email);
	
//		MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v4.g.v/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
//		el9.click();
		
		PageContact pageContact=pageVisualisationContacts.selectContactCreated(nom);
		String actualName =pageContact.recupValueOfName();
		String actualNumber=pageContact.recupValueOfNumber();
		String actualEmail= pageContact.recupValueOfEmail();
		LOGGER.info("Verif du attendu {} valeur {}", nom, actualName);
		Assert.assertEquals("la valeur du nom ne correspondent pas", nom, actualName);
		LOGGER.info("Verif du attendu "+number+" valeur"+actualNumber);
		Assert.assertEquals("la valeur du numero ne correspondent pas", number, actualNumber);
		LOGGER.info("Verif du attendu "+email+" valeur"+actualEmail);
		Assert.assertEquals("la valeur de l'eamil ne correspondent pas", email, actualEmail);
		//  MobileElement el11 = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/contact_number");
		// MobileElement el12 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_deny_button");


	}
}
