package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_calisma {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/watch?v=M3HuopD5sFc&list=PLFidTVJjd_thymI_TaNTHRIyZ_s4_yCG2&index=1&ab_channel=B59QATRWINTER");
        Thread.sleep(2000);
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.close();// driveri kapatir.
    }
}
