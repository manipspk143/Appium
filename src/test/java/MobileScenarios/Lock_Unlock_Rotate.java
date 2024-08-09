package MobileScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import driversession.DriverUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_Rotate {
	@Test
	public void testdevicegeneralFeatures() {

		AppiumDriver driver = DriverUtility.initAndroidSession();
		/*
		 * Methods for lock and unlock and rotate lockdevice(); unlockDebice();
		 * rotate(ScreenOrientation);
		 */

		// why means commenting this steps used only one time many times used this
		// device is locked so that's why commenting
//	  ((AndroidDriver)driver).lockDevice();
//	  System.out.println("Device is locked");
//	  
//	  ((AndroidDriver)driver).unlockDevice();
//	  System.out.println("Device is unlocked");
//	  

		// rotate
		((AndroidDriver) driver).rotate(ScreenOrientation.LANDSCAPE);
		System.out.println("Screen in Landscape mode");

		((AndroidDriver) driver).rotate(ScreenOrientation.PORTRAIT);
		System.out.println("Screen in Portrait mode");

//	  
	}
}
