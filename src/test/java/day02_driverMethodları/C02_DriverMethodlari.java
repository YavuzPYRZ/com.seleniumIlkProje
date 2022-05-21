package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();// maximize = browser'i tam sayfa yapar

        driver.get("https://www.amazon.com"); //
        System.out.println("actial title : " + driver.getTitle());
        System.out.println("actual url : " + driver.getCurrentUrl());
        driver.close();

    }
}
