package day04_XPATH_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        // 1- https://the.internet.herokuapp.com/add remove elements/ adresine gidin
        driver.get("https://the.internet.herokuapp.com/add remove elements/");

        // 2- add elemet butonuna basin
        driver.findElement(By.xpath("//*[text()='Add element']")).click();

        // 3- delete butonunun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Delete butonu goruntuleme testi PASSED");
        }else{
            System.out.println("Delete butonu goruntule testi FAILED");
        }

        // 4- delete tusuna basin
        deleteButton.click();

        // 5- ""add/remove elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//*[text()='Add/Remove elements']"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add/remove yazi testi PASSED");
        }else{
            System.out.println("Add/remove yazi  testi FAILED");
        }



        Thread.sleep(3000);
        driver.close();


    }
}
