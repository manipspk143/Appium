package generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public  class Utility {
	
	public static void getscreenshot(WebDriver driver,String filename) {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		  //temp file
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  
		  //dest file
		  File dest=new File(System.getProperty("user.dir")+"//Screenshots//"+filename+System.currentTimeMillis()+ ".png");
		  
		 
			try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	public static void Screenshot(AppiumDriver driver) {
		 //screen shot
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  //creation of folder in eclipse
		  File dest=new File(System.getProperty("user.dir")+"\\Screenshots\\APIDemos"+System.currentTimeMillis()+"png");
		  
		  try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void Scrolluptocount(AppiumDriver driver,WebElement pagearea,int count ) {
		//scrollGesture
		for(int i=0;i<=count;i++) {
		 driver.executeScript("Mobile:scrollGesture",ImmutableMap.of("elementId",((RemoteWebElement)pagearea).getId(),
				 "direction","Up","Percent",0.75));
		 System.out.println("Iteration count is:"+i);
		}
}
		
	

public static void ScrollDown(AppiumDriver driver,WebElement pagearea) {
	//scrollGesture
		 driver.executeScript("Mobile:scrollGesture",ImmutableMap.of("elementId",((RemoteWebElement)pagearea).getId(),
				 "direction","down","Percent",0.75));
		 System.out.println("Page Scroll Down!");
		
}
public static void ScrollUp(AppiumDriver driver,WebElement pagearea) {
	//scrollGesture
		 driver.executeScript("Mobile:scrollGesture",ImmutableMap.of("elementId",((RemoteWebElement)pagearea).getId(),
				 "direction","Up","Percent",0.75));
		 System.out.println("Page Scroll Up!");
}
public static void ScrollLeft(AppiumDriver driver,WebElement pagearea) {
	//scrollGesture
		 driver.executeScript("Mobile:scrollGesture",ImmutableMap.of("elementId",((RemoteWebElement)pagearea).getId(),
				 "direction","Left","Percent",0.75));	 
		 System.out.println("Page Scroll Left!");
}
public static void ScrollRight(AppiumDriver driver,WebElement pagearea) {
	//scrollGesture
		 driver.executeScript("Mobile:scrollGesture",ImmutableMap.of("elementId",((RemoteWebElement)pagearea).getId(),
				 "direction","Right","Percent",0.75));
		 System.out.println("Page Scroll Right!");
}


//swipe gesture
public static void SwipeLeft(AppiumDriver driver,WebElement area) {
//swipe
driver.executeScript("Mobile:SwipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)area).getId(),"direction","Left","percent","0.75"));

System.out.println("Swipe left is completed");
}

public static void SwipeRight(AppiumDriver driver,WebElement area) {
	//swipe
	driver.executeScript("Mobile:SwipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)area).getId(),"direction","Right","percent","0.75"));

	System.out.println("Swipe Right is completed");
	}

public static void Swipeup(AppiumDriver driver,WebElement area) {
	//swipe
	driver.executeScript("Mobile:SwipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)area).getId(),"direction","up","percent","0.75"));

	System.out.println("Swipe up is completed");
	}

public static void Swipedown(AppiumDriver driver,WebElement area) {
	//swipe
	driver.executeScript("Mobile:SwipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)area).getId(),"direction","down","percent","0.75"));

	System.out.println("Swipe down is completed");
	}



	
	


}
