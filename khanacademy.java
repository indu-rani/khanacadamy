package webapp;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.awt.Dimension;
import java.awt.Panel;

import static io.appium.java_client.touch.TapOptions.tapOptions;;

public class khanacademy {
		AndroidDriver<AndroidElement> driver;
			
			@BeforeTest
			public void BT() throws MalformedURLException
			{
		    DesiredCapabilities dc = new DesiredCapabilities();
				
		    dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RZ8N71X63QW");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"org.khanacademy.android.ui.library.MainActivity");
			driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
				}
			@Test(priority=0)

			public void search() throws InterruptedException
			{
				driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
				driver.findElementByAndroidUIAutomator("text(\"Math\")").click();
				driver.findElementByAndroidUIAutomator("text(\"Class 6 (Foundation)\")").click();
				driver.findElementByAndroidUIAutomator("text(\"Multiplication and division\")").click();
				driver.findElementByAndroidUIAutomator("text(\"Multiplying multi-digit numbers\")").click();
				driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Bookmark\"]/android.widget.ImageView")).click();
				driver.findElementByAndroidUIAutomator("text(\"GOT IT\")").click();
				//driver.pressKey(new KeyEvent(AndroidKey.HOME));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				//driver.pressKey(new KeyEvent(AndroidKey.BACK));

			}
		
            @Test(priority=1)
            public void testcase1() throws InterruptedException
            {
	           Thread.sleep(2000);
	           //driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
	           //Thread.sleep(1000);
	           //driver.findElements(MobileBy.className("android.view.ViewGroup")).get(1).click();
               driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
               driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click();
	           driver.findElementByAndroidUIAutomator("text(\"indusandeepb@gmail.com\")").click();

            }
            @Test(priority=2)
		
            public void testcase2() throws InterruptedException
            {
	          Thread.sleep(3000);
	          driver.findElementByAndroidUIAutomator("text(\"Select language\")").click();
	          Thread.sleep(3000);
	          driver.findElements(MobileBy.className("android.widget.TextView")).get(2).click();
	          Thread.sleep(3000);
	          driver.findElementByAndroidUIAutomator("text(\"English\")").click();
	          Thread.sleep(3000);
	          driver.pressKey(new KeyEvent(AndroidKey.BACK));
	//driver.pressKey(new KeyEvent(AndroidKey.BACK));
	//driver.findElements(MobileBy.className("android.widget.RadioButton")).get(2).click();
           }
@Test(priority=3)

public void testcase3() throws InterruptedException
{
	Thread.sleep(3000);
	TouchAction TA=new TouchAction(driver);
	//AndroidElement p1=driver.findElementByAndroidUIAutomator("text(\"Select language\")");
	//AndroidElement p2=driver.findElementByAndroidUIAutomator("text(\"Join class\")");
	driver.findElementByAndroidUIAutomator("text(\"Join class\")").click();
	//TA.longPress(longPressOptions().withElement(element(p1)).withDuration(ofSeconds(3))).moveTo(element(p2)).release().perform();
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Join class\"))").click();
	//TA.longPress(PointOption.point(572,241)).moveTo(PointOption.point(572, 1893)).release().perform();
    driver.findElement(MobileBy.AccessibilityId("e.g. ABC123 or teacher@example.com")).sendKeys("indusandeepb@gmail.com");
    driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    Thread.sleep(3000);
   // AndroidElement t1= driver.findElementByAndroidUIAutomator("text(\"ADD\")");
   // TA.longPress(longPressOptions().withElement(element(t1)).withDuration(ofSeconds(3)));
    driver.findElementByAndroidUIAutomator("text(\"DISMISS\")").click();
}
@Test(priority=4)

public void settings() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
	driver.findElementByAndroidUIAutomator("text(\"View progress report\")").click();
	Thread.sleep(6000);
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Last 7 days\"))").click();
	//driver.findElementByAndroidUIAutomator("text(\"Last 7 days\")").click();
	 TouchAction TA=new TouchAction(driver);
	// TA.longPress(PointOption.point(1010,1834)).moveTo(PointOption.point(16, 1834)).release().perform();
	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
}
@Test(priority=5)

public void bookmarks() throws InterruptedException
{
	driver.findElement(MobileBy.AccessibilityId("Bookmarks tab")).click();
	//driver.findElementByAndroidUIAutomator("text(\"Edit\")").click();
	//driver.findElementByAndroidUIAutomator("text(\"Multiplying multi-digit numbers\")").click();
	//driver.findElementByAndroidUIAutomator("text(\"Delete\")").click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
}
@Test(enabled=false)

public void mycourses() throws InterruptedException
{
	Thread.sleep(3000);
	//AndroidElement one=driver.findElementByAndroidUIAutomator("text(\"Select language\")");
	//  TouchAction TA=new TouchAction(driver);
	//  Double Screenheightend= one.getSize().getWidth() * 0.9 ;
		//int scrollover=Screenheightend .intValue();
		//Thread.sleep(3000);
		//TA.longPress(longPressOptions().withElement(element(one)).withDuration(ofSeconds(3))).moveTo(PointOption.point(0, scrollover)).release().perform();
	//TouchAction TA=new TouchAction(driver);
	//TA.longPress(PointOption.point(572,241)).moveTo(PointOption.point(572, 1893)).release().perform();
	//driver.findElementByAndroidUIAutomator("text(\"Edit\")").click();
	driver.findElementByAndroidUIAutomator("text(\"Class 3 math (India)\")").click();
}


}
