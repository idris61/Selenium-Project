import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Odev1 {

    public static void main(String[] args) {
        /*
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
                Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com/");
        System.out.println(driver.getTitle());

        String arananKelime = "Amazon";

        if (driver.getTitle().contains(arananKelime)){
            System.out.println("Title Testi PASSED");
        }else System.out.println("Title Testi FAILED");

        // Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        // Sayfa url’inin “amazon” icerdigini test edin.
        String arananKelime2 = "amazon";

        if (driver.getCurrentUrl().contains(arananKelime2)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");

        // Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        // Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualHtml = driver.getWindowHandle();
        String arananKelime3 = "Gateway";

        if (actualHtml.contains(arananKelime3)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        driver.close();
    }
}
