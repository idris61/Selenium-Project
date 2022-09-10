package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_Odev2 {

    public static void main(String[] args) throws InterruptedException {
        /*
        Yeni bir Class olusturalim.C05_NavigationMethods
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://youtube.com");    // Youtube ana sayfasina gidelim
        Thread.sleep(3000);

        driver.navigate().to("https://www.amazon.com"); // Amazon soyfasina gidelim.
        Thread.sleep(3000);

        driver.navigate().back();    // Tekrar YouTube’sayfasina donelim
        Thread.sleep(3000);

        driver.navigate().forward(); // Yeniden Amazon sayfasina gidelim
        Thread.sleep(3000);

        driver.navigate().refresh(); // Sayfayi Refresh(yenile) yapalim

        driver.quit();  // Tum sayfalari kapatalim
    }
}
