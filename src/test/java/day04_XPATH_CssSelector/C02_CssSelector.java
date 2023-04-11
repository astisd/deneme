package day04_XPATH_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;


public class C02_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        // 1- gerekli ayarlari yapin
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new  ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // 3- browseri tam sayfa yapin
        driver.manage().window().maximize();

        // 4- sayfayi "refresh" yapin
         driver.navigate().refresh();

        // 5- sayfanin basliginin "Spend less" ifade icerdigini test edin
        String expectedMetin="Spend less";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedMetin)){
            System.out.println("Titele testi PASSED");
        }else{
            System.out.println("Titele testi FAILED");

        }

        // 6- gift cards sekmesine basin
        driver.findElement(By.partialLinkText("Gift Card")).click();


        // 7- birthday butonuna basin
        driver.findElement(By.xpath("//a[@aria-label='birthday']")).click();


        // 8- best seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//li[@class='a-carousel-card acswidget-carousel__card'])[1]")).click();

        // 9- gift card details den 25$ i secin
        driver.findElement(By.xpath("//button[@id='gc-mini-picker-amount-1'])[1]")).click();

        // 10- urun ucretiinin 25$ oldugunu test edin
        WebElement urunUcretElementi = driver.findElement(By.xpath("//span[text()='$25.00'"));
        System.out.println(urunUcretElementi.getText());






        // 11- sayfayi kapatin

        Thread.sleep(2000);



        driver.close();

    }
}
