package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        // amazona gitip nutella icin arama yapin
        // ilk sayfada cikan urunlerin icerisinde
        // en yuksek fiyati bulun


        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        List<WebElement> fiyatlarListesi = driver.findElements(By.className("a-price-whole"));

        System.out.println("fiyatlarListesi");
        //WebElement bir obje oldugundan direk yazdirilamaz
        System.out.println(fiyatlarListesi);

        // bunun icin for-each loop kullanarak
        // her bir webelement uzerindeki yazilari tek tek yazdirmaliyiz


        for (WebElement each : fiyatlarListesi
        ) {
            System.out.println(each.getText());

        }
        // en yuksek fiyati bulabilmek icin java bilgimizi kullanmaliyiz
        // 1- web elementlerden getText ile fiyati String olarak alin
        // 2- string fiyati kiyaslama yapabilmek icin Integer a cevirin
        // 3- en yuksek fiyati bulup yazdirin

        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat = 0;
        for (WebElement each : fiyatlarListesi
        ) {

            fiyatStr = each.getText();
            fiyatInt = Integer.parseInt(fiyatStr);


            if (fiyatInt>enYuksekFiyat){
                enYuksekFiyat = fiyatInt;

            }

        }
        System.out.println("En yuksek urun fiyati : " + enYuksekFiyat);


        Thread.sleep(5000);
        driver.close();






    }

}
