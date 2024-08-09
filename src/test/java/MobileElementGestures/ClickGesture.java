package MobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driversession.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGesture {
  @Test
  public void testClickGesture() {
	 AppiumDriver driver= DriverUtility.initAndroidSession();
	 
//	 view
	 WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Views"));
	 
	 //ClickGesture
	 driver.executeScript("mobile:ClickGesture",ImmutableMap.of("elementid",((RemoteWebElement)ele1).getId()));
	 System.out.println("Click Gesture is completed");
	 
  }
  
}
