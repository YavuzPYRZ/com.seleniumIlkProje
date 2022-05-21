package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {

        // amazon sitesine gidip Kaynak kodlarına "spand less" yazdıgını test edin.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");


        String sayfaKaynakKodları =  driver.getPageSource();
        String arananKelime = "spend less";
        if (sayfaKaynakKodları.contains(arananKelime)){
            System.out.println("Kaynak Kodu Testi PASSED");

        }else{
            System.out.println("Kaynak kodlarında" + arananKelime +"yok test FAILLED");
        }
    }
}
