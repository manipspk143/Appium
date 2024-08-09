package MobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driversession.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragAndDrop {
  @Test
  public void testdrag() {
	 AppiumDriver driver= DriverUtility.initAndroidSession();
	 
	 //view
	 driver.findElement(AppiumBy.accessibilityId("Views")).click();
	 
	 //drag and drop
	 driver.findElement(AppiumBy.accessibilityId("Drag And Drop")).click();
	 
	 //first circle
	WebElement ele1= driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	
	//DragGesture
	driver.executeScript("Mobile:DragGesture",ImmutableMap.of("elementId",((RemoteWebElement)ele1).getId(),
	"endX",704,
	"endY",1134
	));
	
	//result text
	String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	System.out.println("ResultText is:"+text);
	 
  }
}
