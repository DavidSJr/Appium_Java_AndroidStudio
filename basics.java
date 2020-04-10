import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.remote.RemoteWebElement;
import java.io.File;

//import io.appium.java_client.FindsByAndroidUIAutomator;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base{


	public static void main(String[] args) throws MalformedURLException {
		//TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilites();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	//  xpath id className, androidUIAutomator
	/*  xpath Syntax
	 * //tagNaMobileElement='value']
	 */
	//((FindsByAndroidUIAutomator<AndroidElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoVIew(new UiSelector().textContains(\"Views\").instance(0))");
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	driver.findElementById("android:id/checkbox").click();
	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	driver.findElementByClassName("android.widget.EditText").sendKeys("hello"); //Types characters to field box
	driver.findElementsByClassName("android.widget.Button").get(1).click(); //Multiple indexes with the same class. Finds all elements with the same Class (android.widget.Button).
	
		
	}

}
