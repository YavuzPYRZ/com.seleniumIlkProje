package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // amazona gidip Nutella aratarlım
        driver.get("https://www.amazon.com");
        //findElement(By....locator) istediğimiz web elementini bize dondürur.


        // biz de o web elementini kullanmak için bir objeye assign ederiz.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");
       // aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); // bu direk yazıdan sonra enter a basar ve aratır.
        Thread.sleep(2000);

        WebElement aramaTusu = driver.findElement(By.id("nav-search-submit-button"));
        aramaTusu.click();
        Thread.sleep(4000);



    }
}
