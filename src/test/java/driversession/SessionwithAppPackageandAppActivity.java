package driversession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SessionwithAppPackageandAppActivity {
  @Test
  public void CreateSession() throws MalformedURLException {
  UiAutomator2Options option=new  UiAutomator2Options();
  option.setPlatformName("Android");
  
  option.setCapability("appium:appPackage","com.google.android.apps.nexuslauncher");
  option.setCapability("appium:appActivity","com.google.android.apps.nexuslauncher.NexusLauncherActivity");
  
  option.setCapability("appium","com.google.android.apps.messaging");
  option.setCapability("appium","com.google.android.apps.messaging.ui.ConversationListActivity");
  
  //url
  URL url=new URL("http://0.0.0.0:4723");
  
  //server
  AppiumDriver driver=new AndroidDriver(url,option);
  System.out.println("Session Id is"+driver.getSessionId());
  
  }
  
}
