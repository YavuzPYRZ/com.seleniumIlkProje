package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_İlkTest {
    public static void main(String[] args) {
        /*
         1 ) https://www.amazon.com url'ine gidin.
        2 ) başlıgın Amazon kelimesi içerdigini test edin.
        3 ) url nin https://www.amazon.com a esit oldugunu test edin.
        4 ) sayfayı kapatın.

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      //  1 ) https://www.amazon.com url'ine gidin.
       driver.get("https://www.amazon.com");

       // 2 ) başlıgın Amazon kelimesi içerdigini test edin.
       String actualTitel = driver.getTitle();
        String arananKelime = "Amazon";
        if (actualTitel.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        } else{
            System.out.println("Title " + arananKelime + "'yi icermiyor, tetle testi FAİLED");
        }

        //3 ) url nin https://www.amazon.com a esit oldugunu test edin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com ";
        if (actualUrl.equals(expectedUrl)) {
      //      driver.get();
        }

        //4 ) sayfayı kapatın.


    }
}
