package MobileScenarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driversession.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ReadNotifications {
  @Test
  public void Notificationstest() {
	  
	AppiumDriver driver= DriverUtility.initAndroidSession();
	
	//Open notifications
	//To open notification bar diect method is not there
	//we create android instance
	((AndroidDriver)driver).openNotifications();
	
	//test notifications
	//list means two notifications text it means used in multiples also
	System.out.println("********Total Notifications Headings************");
List<WebElement>headings=driver.findElements(AppiumBy.id(""));
System.out.println("Total Notifications is :"+headings.size());
for(WebElement i:headings) {
	System.out.println(i.getText());
	
	//first notification
	System.out.println("********Appium setting text");
	String text=driver.findElement(AppiumBy.id("")).getText();
	System.out.println(text);

	//second notification
	System.out.println("********Silent notification text");
	String text1=driver.findElement(AppiumBy.id("yy")).getText();
System.out.println(text1);

}
  }
}
