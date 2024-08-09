package driversession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class UIAutomator2OptionSession {
  @Test
  public void CreateDriverSesion() throws MalformedURLException {
	  UiAutomator2Options option=new UiAutomator2Options();
	  option.setPlatformName("Android");
	  
	  //set path
	  String appPath=System.getProperty("User.dir")+"src//test//resources//ApiDemos-debug.apk";
	  option.setCapability("appium:app", appPath);
	  
	  //url
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //server driver
	  AppiumDriver driver=new AndroidDriver(url,option);
	  System.out.println("Session Id is:"+driver.getSessionId());
	  
  }

}

