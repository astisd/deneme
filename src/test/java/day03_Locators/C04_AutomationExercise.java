package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;



public class C04_AutomationExercise {
    public static void main(String[] args) {

        // 1- bir test class i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        // 2- https://www.automationexercise.com/adresine gidin
        driver.get("https://www.automationexercise.com/");

        // 3- sayfada 147 adet link bulundugunu test edin
        List<WebElement> Linklistesi = driver.findElements(By.tagName("a"));
        if (Linklistesi.size() == 147) {
            System.out.println("Linklistesi testi PASSED");

        } else {
            System.out.println("Sayfada" + Linklistesi.size() + " adet link var, test FAILED");
        }

        // 4- products linkine tiklayin
        driver.findElement(By.linkText("products")).click();

        // 5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));

        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer testi PASSED");
        }else {
            System.out.println("Special offer testi FAILED");
        }

        /*
        NoSuchElementException driver findElement ile aradigi bir elementi
        bulamazsa olusur.
        */


        // 6- sayfayi kapatin
        driver.close();
    }
}



