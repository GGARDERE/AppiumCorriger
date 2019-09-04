package test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(ContactTest.class);
	
	private AndroidDriver driver;

	@Before
	public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "PixelOreo");
		desiredCapabilities.setCapability("appPackage", "com.simplemobiletools.contacts");
		desiredCapabilities.setCapability("appActivity", ".activities.MainActivity");

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	}

	@Test
	public void sampleTest() {
		LOGGER.info("Yoot mon test commence c'est trop de la bombre de balle parce ce que je viens des années 2K");
		
		AndroidElement el1 =  (AndroidElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		el2.click();
		MobileElement boutonAjouterContact = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/fragment_fab");
		boutonAjouterContact.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/contact_toggle_favorite");
		el4.click();
		MobileElement champFirstName = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/contact_first_name");
		champFirstName.sendKeys("PremierContact");
		MobileElement champNumero = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/contact_number");
		champNumero.sendKeys("0123456789");
		MobileElement champEmail = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/contact_email");
		champEmail.sendKeys("azertyu.op@qsdfgh.fr");
		MobileElement boutonValiderContact = (MobileElement) driver.findElementByAccessibilityId("Save");
		boutonValiderContact.click();
		MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v4.g.v/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/contact_first_name");
		//  MobileElement el11 = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/contact_number");
		// MobileElement el12 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_deny_button");

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
