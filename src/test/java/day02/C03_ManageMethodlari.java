package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ManageMethodlari {
    public static <Webdriver> void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // site için maximum bekleme süresini belirler.
        driver.get("https://amazon.com");
        driver.close();

        /*
        İleride wait konusunu daha geniş olarak ele alacağız.
        Bir sayfa açılırken ilk başta sayfanın içerisinde bulunan elementlere göre bir yükleme süresine ihtiyaç vardır
        veya bir web elementin kullanılabilmesi için zamana ihtiyaç olabilir.
        implicitlyWait bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için beklenecek MAXIMUM süreyi
        belirleme olanağı tanır.
         */


    }
}
