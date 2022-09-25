package Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02_ManageWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1.Yeni bir Classolusturalim.C06_ManageWindow
        //2.Amazon soyfasina gidelim.https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3.Sayfanin konumunu ve boyutlariniyazdirin
        System.out.println("Sayfa ilk konum : " + driver.manage().window().getPosition());
        System.out.println("Sayfa ilk boyut : " + driver.manage().window().getSize());

        //4.Sayfayi simge durumunagetirin
        driver.manage().window().minimize();

        //5.simge durumunda 3 saniye bekleyip sayfayi maximizeyapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Maximize konum : " + driver.manage().window().getPosition());
        System.out.println("Maximize boyut : " + driver.manage().window().getSize());

        //7.Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //8.Sayfanin konumunu ve boyutlarini fullscreen durumundayazdirin
        System.out.println("Fullscreen konum : " + driver.manage().window().getPosition());
        System.out.println("Fullscreen boyut : " + driver.manage().window().getSize());

        //9.Sayfayi kapatin
        driver.close();

    }
}
