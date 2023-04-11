package day02_DriverMetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMetodlari {
    public static void main(String[] args) {
        // Biz browserlari olusturdugumuz driver sayesinde otomate edebiliyoruz
        // Bunun icin her testin basinda mutlaka driver objesi olusturacagiz.

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");
        // Acilan sayfanin basliginin amazon icerdigini test edin.

        String expectedKelime= "amazon";
        String actualResult= driver.getTitle();

        if (actualResult.contains(expectedKelime)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title amazon icermiyor, test FAILED");
            System.out.println(driver.getTitle());
        }

        // gittigimiz sayfanin URL inin http://www.amazon.com/ oldugunu test ediin.

        String expectedUrl= "http://www.amazon.com/";
        String actualResultUrl= driver.getCurrentUrl();

        if (expectedUrl.equals(actualResultUrl)){
            System.out.println("url testi PASSED");
        }else {
           System.out.println("url istediginiz degerde degil");
           System.out.println(driver.getCurrentUrl());
        }

        driver.close();
    }

}







