package MobileElementGestures;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driversession.DriverUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsDemo {
  @Test
  public void ElementLocators() throws InterruptedException {
	AppiumDriver driver=DriverUtility.initAndroidSession();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement ele1=driver.findElement(AppiumBy.accessibilityId("accessibility"));
	System.out.println("Text of mobile element is :"+ele1.getText());
	ele1.click();
	Thread.sleep(2000);
	//navigate
	driver.navigate().back();
	
	//Xpath
	
	WebElement ele2=driver.findElement(AppiumBy.xpath("jjh"));
	System.out.println("Text of element 2:"+ele2.getText());
	ele2.click();
	Thread.sleep(2000);
	
	//navigate
	driver.navigate().back();
	
	//Classname
	WebElement ele3=driver.findElements(AppiumBy.className("")).get(3);
	System.out.println("Text of element 3:"+ele3.getText());
	ele3.click();
	Thread.sleep(2000);
	
	//navigate
	driver.navigate().back();
	
	
	//id=resource id
	WebElement ele4=driver.findElements(AppiumBy.className("")).get(3);
	System.out.println("Text of element 4:"+ele4.getText());
	ele4.click();
	Thread.sleep(2000);
	
	//navigate
	driver.navigate().back();
	
	//uiautomator2 =newAndroiduiautomator
	WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"content\")"));
	System.out.println("Text of element 5:"+ele5.getText());
	ele5.click();
	Thread.sleep(2000);
	
	//navigate
	driver.navigate().back();
	
	
	
	
	
  }
}
