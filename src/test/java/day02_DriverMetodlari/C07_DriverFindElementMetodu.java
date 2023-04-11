package day02_DriverMetodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverFindElementMetodu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.amazon.com");
        // biz herhangi bir elementi driverimiza buldurmak istiyorsak.
        // yapmamiz gereken findelement metodunu kullanmamiz.
        // sonrada bu elemeti neyle bulacagini tarif etmemiz gerekir. bunada Locators denir.
        // su kisim (By.id("twotabsearchtextbox") locators dir.

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        // driver.findElement(By.id("twotabsearchtextbox")); <------- bize bir Webelementigetiriyor,


        aramaKutusu.sendKeys("Nutella"); // aramaKutusu yazip noktaya(.) bastigimizda metodlar cikar.
                                         // selenium hazir metodlari kullanma sanatidir.

        aramaKutusu.submit();            // submit enter tusunun görevini yapar.

        Thread.sleep(5000);
        driver.close();


                            //****WebElments****//
        //***Attributes***//: type,id,value,name,autocomplete,placeholder,class,dir,tabindex,aria-label
        //***Tag***//: input




    }
}
