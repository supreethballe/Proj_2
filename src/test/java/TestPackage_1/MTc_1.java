package TestPackage_1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.concurrent.TimeUnit;

import static TestPackage_1.Base.capabilities;

public class MTc_1 extends Base {
    public static void main(String[] args) throws Exception {

        AndroidDriver<AndroidElement> driver =capabilities();

   driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("suprith");
        driver.findElementById("android:id/button1").click();

    }
}
