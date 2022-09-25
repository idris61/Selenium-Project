package Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01_NavigationMethods {
    public static void main(String[] args) throws InterruptedException {

        //1.Yeni bir Classolusturalim.C05_NavigationMethods

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2.Youtube ana sayfasina gidelim .https://www.youtube.com/
        driver.get("https://www.youtube.com/");

        //3.Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);

        //4.Tekrar YouTube’sayfasinadonelim
        driver.navigate().back();
        Thread.sleep(3000);

        //5.Yeniden Amazon sayfasinagidelim
        driver.navigate().forward();
        Thread.sleep(3000);

        //6.Sayfayi Refresh(yenile)yapalim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //7.Sayfayi kapatalim / Tum sayfalarikapatalim
        driver.quit();


    }
}
