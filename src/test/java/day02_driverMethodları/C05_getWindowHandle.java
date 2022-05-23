package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle()); // CDwindow-612226469A8390EE1F68AFB59549B5A2 (hep deşişir.)
        // sayfanın handle degerini yani sayfanın IP adresinini verir.

        driver.close();

    }
}
