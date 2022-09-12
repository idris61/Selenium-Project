package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_Odev2 {
    public static void main(String[] args) throws InterruptedException {

        /*
        Yeni bir class olusturun (TekrarTesti)
        1- Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        2- Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.

        3- Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        4- Youtube sayfasina geri donun

        5-Sayfayi yenileyin

        6- Amazon sayfasina donun

        7- Sayfayi tamsayfa yapin

        8- Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        Yoksa  doğru başlığı(Actual Title) yazdırın.

        9-Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın,
        degilse doğru URL'yi yazdırın

        10-Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1- Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        //        eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String arananKelime = "youtube";
        if(actualTitle.contains(arananKelime)){
            System.out.println("Title test PASSED");
        }else System.out.println(driver.getTitle());

        // 2- Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime2 ="youtube";
        if(actualUrl.contains(arananKelime2)){
            System.out.println("Url test PASSED");
        }else System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

        // 3- Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        // 4- Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(2000);

        // 5-Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(2000);

        // 6- Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(2000);

        // 7- Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        // 8- Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //        Yoksa  doğru başlığı(Actual Title) yazdırın.
        String arananTitle2 = driver.getTitle();
        String arananKelime3 = "Amazon";
        if(arananTitle2.contains(arananKelime3)){
            System.out.println("Title test PASSED");
        }else System.out.println(driver.getCurrentUrl());

        // 9-Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın,
        // degilse doğru URL'yi yazdırın
        String arananUrl2 = driver.getCurrentUrl();
        String arananKelime4 = "https://www.amazon.com/";
        if(arananUrl2.contains(arananKelime4)){
            System.out.println("Url test PASSED");
        }else System.out.println(driver.getCurrentUrl());

        // 10-Sayfayi kapatin
        driver.close();
    }
}
