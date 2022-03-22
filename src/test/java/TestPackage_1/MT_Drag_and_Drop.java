package TestPackage_1;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class MT_Drag_and_Drop extends Base {
    public static void main(String[] args) throws Exception {

        AndroidDriver<AndroidElement> driver = capabilities();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();


        WebElement from = driver.findElementsByClassName("android.view.View").get(0);
        WebElement dest = driver.findElementsByClassName("android.view.View").get(1);

        TouchAction t = new TouchAction(driver);

t.longPress(longPressOptions().withElement(element(from))).moveTo(element(dest)).release().perform();

      //  t.longPress(element(from)).moveTo(element(dest)).release().perform()

    }

}