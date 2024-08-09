package MobileScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import driversession.DriverUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApp {
  @Test
  public void testApp() throws InterruptedException {
	  
	  AppiumDriver driver= DriverUtility.initAndroidSession();
	 System.out.println("Application status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis")); 
		 
	 //terminate app
	 ((AndroidDriver)driver).terminateApp("io.appium.android.apis"); 
	 System.out.println("After terminate Application status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis")); 
		
	 
	 Thread.sleep(2000);
	 //Activate app
	 ((AndroidDriver)driver).activateApp("io.appium.android.apis"); 
	 System.out.println("After activate Application  status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis")); 
	
	 //uninstall and remove app
	 ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	 System.out.println("Application removed");
	 System.out.println("uninstallation Application  status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	 
	 //install app
	 String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";	
	 ((AndroidDriver)driver).installApp(path); 
	 System.out.println("installation Application  status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis")); 
	 System.out.println("Application is installed");
	
	 //Application Background  running property
	 ((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(10));
	 System.out.println("Application running for 5 sec in Background!");
	 System.out.println("After BackGround exceution Application  status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis")); 
		
  }
}
