package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        /*
        1- amazon.com a gidip arama kutusunu locate edelim
        2- arama kutusunun  tagname'inin input oldugunu test edin.
        3- arama kutusunun attribute'nun degerinin ..... oldugunu test edin.

         */

        //      1- amazon.com a gidip arama kutusunu locate edelim
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //        2- arama kutusunun  tagname'inin input oldugunu test edin.

        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (expectedTagName.equals(actualTagName)){
            System.out.println("Arama kutusu Tag Name testi PASSED");
        }else System.out.println("Arama kutusu Tag Name testi FAİLED");

        //        3- arama kutusunun attribute'nun degerinin field-keywords oldugunu test edin.
        String expectedAttributeName = "field-keywords";
        String actualAttributeName = aramaKutusu.getAttribute("name");
        if (expectedAttributeName.equals(actualAttributeName)){
            System.out.println("Attribiut test PASSED");

        }else             System.out.println("Attribiut test FAİLED");



    }
}
