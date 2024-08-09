package MobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driversession.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

@Test
public class LongClickGesture {
  public void testLongClick() {
	  
	  AppiumDriver driver= DriverUtility.initAndroidSession();
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //Drag and drop
	  driver.findElement(AppiumBy.id("Drag and Drop")).click();
	  
	  //first dot
	  WebElement ele1=driver.findElement(AppiumBy.id(""));
	  
	  //Long Click
	  driver.executeScript("mobile:LongClickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele1).getId(),"duration",3000
			  ));
	  System.out.println("Long Click Gesture is Completed:");
	  
	  
	  driver.executeScript("mobile:LongClickGesture",ImmutableMap.of("elementID",((RemoteWebElement)ele1).getId()));
  }
}
