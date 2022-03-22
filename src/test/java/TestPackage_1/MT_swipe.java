package TestPackage_1;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class MT_swipe extends Base {

    public static void main(String[] args) throws Exception {

        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        driver.findElementByXPath("//*[@content-desc='9']").click();
        TouchAction t = new TouchAction(driver);
        WebElement from = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement to = driver.findElementByXPath("//*[@content-desc='45']");
        t.longPress(longPressOptions().withElement(element(from)).withDuration(ofSeconds(2))).moveTo(element(to)).release().perform();


    }
}