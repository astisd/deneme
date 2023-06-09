package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ByName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.amazon.com");
        WebElement aramaKutusu =  driver.findElement(By.name("field-keywords"));

        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); // + Keys.ENTER ile enter tusuna basarak arama yaptirir.
                                                     // aramaKutusu.submit ilede yapilabiliriz.



        Thread.sleep(1000);
        driver.close();



    }
}
