package Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.SocketHandler;

public class Q04_Homework {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1.Yeni bir class olusturalim(Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligiyazdirin.
        driver.get("https://www.facebook.com/");
        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title test PASSED");
        }else{
            System.out.println("Title test FAILED");
            System.out.println("Dogru baslik :" + actualTitle);
        }

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual”URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("facebook")){
            System.out.println("facebook Url test PASSED");
        }else{
            System.out.println("facebook Url test FAILED");
            System.out.println("Dogru url :" + actualUrl);
        }

        //4.https://www.walmart.com/ sayfasinagidin.
        driver.navigate().to("https://www.walmart.com/");

        //5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains("Walmart.com")){
            System.out.println("Walmar Url test PASSED");
        }else{
            System.out.println("Walmar Url test FAILED");
        }

        //6.Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        Thread.sleep(3000);

        //7.Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //8.Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //9.Browser’ikapatin
        driver.close();

    }
}
