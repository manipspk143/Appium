package MobileScenarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driversession.DriverUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Performanceparameters {
  @Test
  public void testParameters() {
	  AppiumDriver driver = DriverUtility.initAndroidSession();
		
	 List<String>allDatatypes=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
System.out.println(allDatatypes);

//[cpuinfo,memoryinfo,batteryinfo,networkinfo]

System.out.println("Test Battery info");
List<List<Object>>batteryChar=((AndroidDriver)driver).getPerformanceData("packagename","batteryinfo", 5);
System.out.println(batteryChar);
 
System.out.println("*********Test Memory info*******");
List<List<Object>>MemoryChar=((AndroidDriver)driver).getPerformanceData("packagename","Memoryinfo", 5);
System.out.println(MemoryChar);

System.out.println("*********Test cpu info info*******");
List<List<Object>>CpuChar=((AndroidDriver)driver).getPerformanceData("packagename","Cpuinfo", 5);
System.out.println(CpuChar);

System.out.println("*********Test network info info*******");
List<List<Object>>NetworkChar=((AndroidDriver)driver).getPerformanceData("Packagename","NetworkInfo",5);
System.out.println(NetworkChar);

  }
}
