import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilites() throws MalformedURLException {
		// TODO Auto-generated method stub
File f=new File("src");
File fs=new File(f, "ApiDemos-debug.apk"); //Best coding practice not to directly hard code apk path. Instead, use this File method. Can copy/paste to other TC's.
		
	DesiredCapabilities cap=new DesiredCapabilities(); //Class that takes info in JSON and gives the info to the server. Is also in Selenium. Package is imported from Selenium.
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Davidemulator"); //Passing Emulator information. Device name = Davidemulator.
	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath()); //Passing app information. Retrieves from File method from Lines 15/16.
	
	AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap); //Android driver class. Connection to Server. 
	//Send capabilities to server. Local IP is common on Windows OS. 4723 is port Appium is listening to. Can be seen when Appium server is started.
	
	return driver;
	
		}

}
