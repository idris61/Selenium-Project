package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_TekrarTesti {
    public static void main(String[] args) {

     /*
       1. Bir class oluşturun : AmazonSearchTest
       2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
       a. web sayfasına gidin. https://www. amazon.com/
       b. Search(ara) “city bike”
       c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
       e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
     */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // a. web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");

       // b. Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

       // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi = aramaSonucu.get(0).getText();
                            // get(0).getText(); ==> WebElement'in ilkini ve yazısını getir dedik.
        System.out.println(sonucYazisi); // 1-16 of 109 results for "city bike"

        // d. Sadece sonuç sayısını yazdırın
        String [] sonucYazisiE = sonucYazisi.split(" ");
        System.out.println("City Bike arama sonucu : " + sonucYazisiE[2]); // City Bike arama sonucu : 109

        // Sonuç sayısını LAMBda ile yazdırın
        Arrays.stream(sonucYazisi.split(" ")).limit(3).skip(2).forEach(System.out::println); // 109

        // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ilkResim = driver.findElements(By.className("s-image"));
        WebElement ilkResimWE = ilkResim.get(0);
        ilkResimWE.click();

        // Sayfayı kapatınız
        driver.close();





    }
}
