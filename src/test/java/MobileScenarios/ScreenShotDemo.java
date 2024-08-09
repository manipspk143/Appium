package MobileScenarios;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import driversession.DriverUtility;
import io.appium.java_client.AppiumDriver;

public class ScreenShotDemo {
  @Test
  public void ScreenShot() throws IOException {
	  
	  AppiumDriver driver= DriverUtility.initAndroidSession();
	  
	  //screen shot
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  //creation of folder in eclipse
	  File dest=new File(System.getProperty("user.dir")+"\\Screenshots\\APIDemos"+System.currentTimeMillis()+"png");
	  
	  FileHandler.copy(temp, dest);
  }
}
