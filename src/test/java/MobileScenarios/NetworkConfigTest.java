package MobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driversession.DriverUtility;
import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class NetworkConfigTest {
  @Test
  public void testConfiguration() throws InterruptedException {
	  /*
	   * Methods for config
	   * wifi-ToggleWifi()
	   * data-ToggleData()
	   * AirplaneMode-ToggleAirplanMode()
	   * */
	  
	  //create a driver session
	  AppiumDriver driver= DriverUtility.initAndroidSession();
	  
	  System.out.println("Initially Wifi is ON");
	  
	  //ON---->OFF
	  
	  ((AndroidDriver)driver).toggleWifi();
	  System.out.println("Wifi Setting is Off");
	  
	  Thread.sleep(1000);
	  
	 // Off----On
	  
	  ((AndroidDriver)driver).toggleWifi();
	  System.out.println("Wifi Setting is ON");
	  
	  //mobile data
	  //Swipe to next window
	  //area
	  //before swipe we need element first
	  
	 WebElement area= driver.findElement(AppiumBy.id(""));
	  Utility.SwipeLeft(driver,area);
	  
	  
	  System.out.println("Initially status of mobile data is on");
	  
	  //On----Off
	  ((AndroidDriver)driver).toggleData();
	  System.out.println("Current Status data  is Off");
	  Thread.sleep(1000);
	  
	  //Off---->On
	  ((AndroidDriver)driver).toggleData();
	  System.out.println("Current status data is On");
	  Thread.sleep(1000);
	  
	 //airplane mode
	  
	  System.out.println("Initially status of mobileAirplane mode is off");
	  
	  //Off---->on
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  System.out.println("Current status of AirplaneMode is On");
	  
	  Thread.sleep(1000);
		 
	  //On----Off
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  System.out.println("Current Status of AirplaneMode is Off");
	 
	 
  }
}
