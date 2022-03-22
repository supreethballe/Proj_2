package TestPackage_1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base{
    public static AndroidDriver<AndroidElement> capabilities () throws Exception {
        // TODO Auto-generated method stub
        //AndroidDriver<AndroidElement> driver;

        AndroidDriver<AndroidElement> driver;
        DesiredCapabilities cap = new DesiredCapabilities();

        File appDir = new File("src");

        File app = new File( appDir, "APIDemos-debug.apk");


        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixle2" +
                "");


        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");//new step


        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
