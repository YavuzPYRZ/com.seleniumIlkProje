package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_Calisma2 {
    public static void main(String[] args) {
                /*
         1 ) https://www.amazon.com url'ine gidin.


        2 ) başlıgın Amazon kelimesi içerdigini test edin.
        3 ) url nin https://www.amazon.com a esit oldugunu test edin.
        4 ) sayfayı kapatın.

         */
      //  1 ) https://www.amazon.com url'ine gidin.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

      //  2 ) başlıgın Amazon kelimesi içerdigini test edin.
        String baslikNe =driver.getTitle();
        String arananKelime = "Amazon";
        if (baslikNe.contains(arananKelime)){
            System.out.println("Başlıta "+ arananKelime +" kelimesi var.");

        }System.out.println("Başlıta "+ arananKelime +" kelimesi yok.");


      //        3 ) url nin https://www.amazon.com a esit oldugunu test edin.



        driver.close();
    }
}
