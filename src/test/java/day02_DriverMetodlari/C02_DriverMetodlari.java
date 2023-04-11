package day02_DriverMetodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMetodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // sayfayi tam ekran yapalim

        driver.manage().window().maximize();
        System.out.println("maximize window boyutlari"+driver.manage().window().getSize());
        System.out.println("maximize window boyutlari"+driver.manage().window().getPosition());



        driver.manage().window().fullscreen();
        driver.manage().window().setPosition(new Point(100, 100));
        System.out.println("fullscreen window boyutlari"+driver.manage().window().getPosition());
        System.out.println("fullscreen window boyutlari"+driver.manage().window().getSize());

        // browseri istedigimiz konum ve boyuta getirelim.



        driver.close();



    }
}
