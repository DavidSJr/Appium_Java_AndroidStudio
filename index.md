## About
Thank you for visiting my website. I've been a manual tester in software for over 5 years. Below, you will see some scripts I've worked on using Appium. The languages used are Java and XPath. I run these Test Cases on APIDemos-debug.apk. A virtual device was setup in Android Studio in order to run APIDemos-debug. This APK is able to demonstrate multiple actions, such as click, swipe and type in alphanumeric characters.

### base.java

base.java is created to talk to the Appium server (Client code -> Server code). The desired capabilites are connect to the server and open the emulator in order to test the app.

```markdown
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
File fs=new File(f, "ApiDemos-debug.apk"); 
# //Best coding practice not to directly hard code apk path. Instead, use this File method. Can copy/paste to other TC's.
		
	DesiredCapabilities cap=new DesiredCapabilities(); 
# //Class that takes info in JSON and gives the info to the server. Is also in Selenium. Package is imported from Selenium.
	
  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Davidemulator"); 
# //Passing Emulator information. Device name = Davidemulator.
	
  cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath()); 
# //Passing app information. Retrieves from File method from Lines 15/16.
	
	AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap); 
# /*Android driver class. Connection to Server. Send capabilities to server. 
# Local IP is common on Windows OS. 4723 is port Appium is listening to. Can be seen when Appium server is started.*/
	
	return driver;
	
		}

}

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/DavidSJr/Appium_Java_AndroidStudio/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://docs.github.com/categories/github-pages-basics/) or [contact support](https://support.github.com/contact) and we’ll help you sort it out.
