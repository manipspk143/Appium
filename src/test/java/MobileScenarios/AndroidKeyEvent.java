package MobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driversession.DriverUtility;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AndroidKeyEvent {
  @Test
  public void testKeyBoard() {
	  AppiumDriver driver= DriverUtility.initAndroidSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("views")).click();
	  
	  //Scroll-3
	  WebElement area=driver.findElement(AppiumBy.id(""));
	  Utility.Scrolluptocount(driver, area, 3);
	  
	  //TextFields
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  //edit 
	  driver.findElement(AppiumBy.id("")).sendKeys("Hello All");
	  
	  //edit 1 keyevent ,
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.M));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.A));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.N));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.I));
	  
	  
  }
}
