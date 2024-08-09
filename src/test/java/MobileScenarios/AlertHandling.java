package MobileScenarios;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import driversession.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertHandling {
  @Test
  public void alertTest() {
	  
	  /*
	   * Alert is  a interface in selenium web driver
	   * Alert alr=driver.switchTo().Alert();
	   * get text();
	   * accept();
	   * dismiss();
	   * sendkeys();
	   * 	   * */
	  
	  AppiumDriver driver= DriverUtility.initAndroidSession();
	  //App
	   driver.findElement(AppiumBy.accessibilityId("App")).click();
	   //alerts
	   driver.findElement(AppiumBy.accessibilityId("Alerts")).click();
	   
	   //alert ele
	   driver.findElement(AppiumBy.accessibilityId("")).click();
	   
	   //alert window open
	   
	   Alert alt=driver.switchTo().alert();
	   System.out.println("Text of the alert:"+alt.getText());
	   
	   alt.accept();
		  
		

	  
  }
}
