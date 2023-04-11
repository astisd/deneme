package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {

        // amazon anasayfaya gidin
        // gift card linkini tiklayin
        // gift card saysasina gittigini test edin


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        //WebElement giftCardLinki = driver.findElement(By.linkText("Gift Cards"));



        WebElement giftcardlinki = driver.findElement(By.partialLinkText("Gift Cards"));
        giftcardlinki.click();

        // istenenen sayfaya gittigini test etmek icin
        // titelin gift card icerdigini test edebiliriz

        String expectedKelime="Gift Cards";
        String actualTitel=driver.getTitle();

        if (actualTitel.contains(expectedKelime)){
            System.out.println("Gift Cards testi PASSED");
        }else {
            System.out.println("Gift Card testi FAILED");
        }

        Thread.sleep(4000);
        driver.close();



    }
}
