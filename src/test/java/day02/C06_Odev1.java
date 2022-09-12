package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_Odev1 {

    public static void main(String[] args) throws InterruptedException {
        /*

        1 -ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        2- Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.

        3- https://www.walmart.com/ sayfasina gidin.

        4- Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        5- Tekrar “facebook” sayfasina donun

        6- Sayfayi yenileyin

        7- Sayfayi tam sayfa (maximize) yapin

        8- Browser’i kapatin

         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        // oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String title = "facebook";
        if (driver.getTitle().equals("facebook")) {
            System.out.println("Title testi PASSED");
        } else { System.out.println("Dogru baslik : " + driver.getTitle());
        }

        // 2- Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "facebook";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url Testi PASSED");
        }else {
            System.out.println("Url Testi Faild. Actual Url : " + actualUrl);
        }
        // 3- https://www.walmart.com/ sayfasina gidin.
        String gidilecekUrl = "https://www.walmart.com/sayfasina";
        driver.navigate().to(gidilecekUrl);
        Thread.sleep(3000);

        // 4- Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String arananKelime2 = "Walmart.com";
        String title2 = driver.getTitle();
        if(title2.contains(arananKelime2)){
            System.out.println("Title testi PASSED.");
        }

        // 5- Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        Thread.sleep(3000);

        // 6- Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

        // 7- Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();


        // 8- Browser’i kapatin
        driver.close();

    }

}
