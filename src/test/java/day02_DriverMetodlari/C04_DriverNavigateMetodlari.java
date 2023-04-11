package day02_DriverMetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class C04_DriverNavigateMetodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //get ile ayni islemi yapar.
        driver.navigate().to("http://www.amazon.com");


        // bir baska website gidelim.
        driver.get("https://www.wisequarter.com");


        // yeniden amazona dönelim.
        driver.navigate().back();

        // tekrar wisequarter.com`a gitmek istersek.
        driver.navigate().forward();





    }
}
