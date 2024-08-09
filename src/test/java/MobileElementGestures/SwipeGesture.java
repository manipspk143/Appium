package MobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driversession.DriverUtility;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGesture {
  @Test
  public void Swipetest() {
	  AppiumDriver driver= DriverUtility.initAndroidSession();
	  //view
	   driver.findElement(AppiumBy.accessibilityId("Views")).click();

	  //gallery
	  
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1.photos")).click();
	  //elearea-swipe
	  WebElement area=driver.findElement(AppiumBy.id(""));//Change of element id
	  
	  //swipe
//	  driver.executeScript("Mobile:SwipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)area).getId(),"direction","Left","percent","0.75"));
//	  
//	  System.out.println("Swipe left is completed");
 
  Utility.Swipedown(driver, area);
  System.out.println("Swipe down is completed");
	
  
  
  Utility.Swipeup(driver, area);
  System.out.println("Swipe up is completed");
  
  
  Utility.SwipeLeft(driver, area);
  System.out.println("Swipe left is completed");

  
  Utility.SwipeRight(driver, area);
  System.out.println("Swipe Right is completed");
	
  }
}
