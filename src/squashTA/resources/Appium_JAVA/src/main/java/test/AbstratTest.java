package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public abstract class AbstratTest {
	
	protected static AndroidDriver<AndroidElement> driver;
	private static final Logger LOGGER = LoggerFactory.getLogger("LoggerTest");
	public AbstratTest() throws MalformedURLException{
		
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "PixelOreo");
	    desiredCapabilities.setCapability("appPackage", "com.simplemobiletools.contacts");
	    desiredCapabilities.setCapability("appActivity", ".activities.MainActivity");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver<AndroidElement>(remoteUrl, desiredCapabilities);
		LOGGER.info("Début du test initialisation du setup");
	    //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.resetApp();
	}
	
}
