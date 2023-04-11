package day01_driverMetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {
    public static void main(String[] args) {
        System.setProperty("webdriver.crome.driver","src/drivers/chromedriver.exe");
        // windows olanlar sonunda .exe yazmali, mac de buna gerek yok

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.close();


        /*
        1-Selenium jar dosyalarini ve chromdriver driver ini manuel olarak sisteme tanitmis olduk
        Eger firefox veya safari ile calismamiz gerekse,
        bu defa fa onlarin driverlarini indirip, manuel olarak
        10.satirda o driverlari tanimlamaliyiz.

        2- 13.satirda ChromDriver() constructor ini kullanarak bir obje olusturduk
        bu objeyi kullanmasak bile
        bu satirdan dolayi bos bir browser acilir.

        3- driver.get(url) driver i yazdigimiz url ye goturur.
        url yazarken www yazmasak calisir.
        ancak https:// yazmasak method calismaz.

         */



    }
}
