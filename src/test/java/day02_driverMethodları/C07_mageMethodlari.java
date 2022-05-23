package day02_driverMethodları;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_mageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("pencere olculeri"+driver.manage().window().getSize());
        System.out.println("Pencere konumu "+driver.manage().window().getPosition());
        driver.get("https://www.youtube.com");

        // pencereye yeni konum verelim.
        // driver.manage().window().setPosition(new Point(25,58)); browserin yerini belirleyebiliriz.
        // driver.manage().window().getSize(new Dimension(800,450)); genişliklerini ayarlar(burada tam olmadı :(   )

        Thread.sleep(2000);
        driver.close();
    }
}
