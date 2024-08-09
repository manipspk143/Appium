package MobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driversession.DriverUtility;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void ScrollTest() throws InterruptedException {
	  AppiumDriver driver= DriverUtility.initAndroidSession();
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //view for action
	 WebElement pagearea= driver.findElement(AppiumBy.id(""));
	
	 //scrollGesture
//	 driver.executeScript("Mobile:scrollGesture",ImmutableMap.of("elementId",((RemoteWebElement)pagearea).getId(),
//			 "direction","down","Percent",0.75));
//	 
//	 System.out.println("Page Scroll Down!");
//	  
	 Utility.ScrollDown(driver, pagearea);
	 System.out.println("Page Scroll Down!");
		
	 Thread.sleep(2000);
	 Utility.ScrollUp(driver, pagearea);
	 System.out.println("Page Scroll Up!");

	 Thread.sleep(2000);
		
	 Utility.ScrollLeft(driver, pagearea);
	 System.out.println("Page Scroll Left!");

	 Thread.sleep(2000);
		
	 Utility.ScrollRight(driver, pagearea);
	 System.out.println("Page Scroll Right!");

	 Thread.sleep(2000);
		
	 Utility.Scrolluptocount(driver, pagearea, 2);
	// System.out.println("Iteration count is:");
  }
}
