package day02_DriverMetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class C05_WindowHandeleDegeri {
    public static void main(String[] args) {

        // her teste mutlaka yazmamiz gerekiyor.(3 lü grubu)
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


        // Windowhandl degerini yazdiralim.
        System.out.println(driver.getWindowHandle()); //CDwindow-53C19557B109A424F7477C873F143F6A

        driver.close();


    }
}
