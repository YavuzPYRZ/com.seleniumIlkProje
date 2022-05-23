package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        // amazona geri donelim
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden facebook'a giri doneleim
        driver.navigate().forward();
        Thread.sleep(2000);

        // sayfayı yenileyelim (refresh)
        driver.navigate().refresh();
        Thread.sleep(2000);




        /*

         */
    }
}
