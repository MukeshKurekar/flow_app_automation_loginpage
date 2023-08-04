package App_automation.Flow_login.Pages;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;

//import org.testng.annotations.Test;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidOptions;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//
//public class First_test {
//    @Test
//    public void configureAppium() throws MalformedURLException {
//        AndroidOptions options = new AndroidOptions();
//        options.setCapability("deviceName", "sdk_gphone64_arm64");
//        options.setCapability("app", "/Users/lord_ajinkya/Library/Android/sdk");
//        
//        URL url = new URL("http://0.0.0.1:4723/wd/hub");
//        AndroidDriver driver = new AndroidDriver(url, options);
//        
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        // Add your test logic here...
//        
//        driver.quit();
//    }
//}

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class First_test {
	public AndroidDriver driver;

	
	
	@Test
	public void setUp() throws MalformedURLException {
		// Start the Appium server
      
        
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("sdk_gphone64_arm64");
		options.setUdid("emulator-5554");
//		options.setAppPackage("com.android.chrome");
		options.setAutomationName("UiAutomator2");
		options.setPlatformName("Android");
		options.setCapability("goog:chromeOptions", options);
	    options.setApp("/Users/lord_ajinkya/eclipse-workspace/Flow_login/src/test/resources/apps/app-prod-release.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		options.setAutoGrantPermissions(true);
		
		
		
		driver.findElement(AppiumBy.accessibilityId("Sign in"));
		
//        WebElement elementToClick = driver.findElement(AppiumBy.id("com.google.android.apps.nexuslauncher:id/overview_actions_view"));
//        elementToClick.click();


//		driver.quit();
//		driver.findElement(find)
	}
//	@Test
//    public void configureAppium() {
//        driver.get("https://www.amazon.com");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
//        // Your test steps here
//    }

}
    





