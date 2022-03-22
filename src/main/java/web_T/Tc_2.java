package web_T;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_2 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.youtube.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Hello");
        driver.findElement(By.id("search-icon-legacy")).click();
    }
}