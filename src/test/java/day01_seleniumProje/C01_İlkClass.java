package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_İlkClass {

    public static void main(String[] args) throws InterruptedException {
        /*
        en ilkel haliyle bir otomasyon yapmak için
        Class ımıza otomasyon için gerekli olan web driverin yerini gostermemiz gerekir.
        bunun için java kutuphanesinden System.setProperty() meethodu kullanırız.

        method 2 parametre istemektedir. ilki kullanacagımız driverÇ webdriver.chrome.driver
        ikincisi ise bu driverin fiziki yolu :src/resources/drivers/chromedriver.exe

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
                WebDriver driver = new ChromeDriver();


        driver.get("https://www.techproeducation.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        //driver.close();
    }
}
