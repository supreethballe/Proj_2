package TestPackage_1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.concurrent.TimeUnit;

public class MTc_UI_automator extends Base {
    public static void main(String[] args) throws Exception {

        AndroidDriver<AndroidElement> driver = capabilities();

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

     driver.findElementByAndroidUIAutomator("text(\"Views\")").click();



    }
}
