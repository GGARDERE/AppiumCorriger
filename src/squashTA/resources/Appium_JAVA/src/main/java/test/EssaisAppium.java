package test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import utils.StepLoggerProvider;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class EssaisAppium {

	  private AndroidDriver driver;
	  
	  private static final Logger LOGGER = StepLoggerProvider.getLogger();

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "PixelOreo");
	    desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	  @Test
	  public void sampleTest() {
		 LOGGER.info("Yoot mon test commence c'est trop de la bombre de balle parce ce que je viens des années 2K");
	    MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_4");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("multiply");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("equals");
	    el4.click();
	    MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
	  String result = el5.getText();
	  Assert.assertEquals("Tu t'es planté Dany ! Retourne en CP !!!", "12", result);

	  }

	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}
	
	
	
	
	
	
	
