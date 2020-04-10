import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomator extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	
	AndroidDriver<AndroidElement> driver=Capabilites();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElementByAndroidUIAutomator("attribute("value")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click(); //Uses Android UI Automator
		
		//driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		// Validate clickable feature for all options
		  // driver.findElementsByAndroidUIAutomator("new UiSelector().property(true)");
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); // Clickable is a property, not an attribute
		
	}

}
