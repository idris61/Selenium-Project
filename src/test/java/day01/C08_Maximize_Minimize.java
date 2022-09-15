package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_Maximize_Minimize {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        // 1-E driver.manage().window().maximize(); --> icinde oldugu sayfayi maximize yapar
        // 1-F driver.manage().window().fullscreen(); --> icinde oldugu sayfayi fullscreen yapar

        // farklarini gormek icin bu method'lari kullanip, baslangic noktalarini ve boyutlarini yazdiralim
        driver.manage().window().maximize();
        System.out.println("maximize konum : " + driver.manage().window().getPosition()); // (-8, -8)
        System.out.println("maximize boyut : " + driver.manage().window().getSize()); // (1616, 868)
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : " + driver.manage().window().getPosition()); // (0, 0)
        System.out.println("fullscreen boyut : " + driver.manage().window().getSize()); // (1603, 902)
        Thread.sleep(3000);

        // 1-G driver.manage().window().minimize(); --> sayfayi simge durumunda kucultur
        driver.manage().window().minimize();

    }
}
