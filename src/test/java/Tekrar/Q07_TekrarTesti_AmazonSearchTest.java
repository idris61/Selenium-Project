package Tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Q07_TekrarTesti_AmazonSearchTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1.Bir class oluşturun :AmazonSearchTest
        //2.Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a.web sayfasına gidin.https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // b.Search(ara) “citybike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("citybike"+ Keys.ENTER);

        // c.Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));

        System.out.println("List deki WebElement sayisi : " +aramaSonucu.size()); // 115

      // for (WebElement each : aramaSonucu) { // WebElement'leri yazdırdım.
      //     System.out.println(each.getText());

      // }

        String sonucYazisi = aramaSonucu.get(0).getText();
                        // get(0).getText(); ==> WebElement'in ilkini ve yazısını getir dedik.

        System.out.println(sonucYazisi); // 16 results for "citybike"

        // ** Sadece sonuç sayısını yazdırın
        String [] sonucYazisiArr = sonucYazisi.split(" ");

        System.out.println("Sadece Sonuc sayisi : " + sonucYazisiArr[0]);


        // d.Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkResim = driver.findElements(By.className("s-image"));

        ilkResim.get(0).click();

        // driver.findElement(By.xpath(("(//img[@class='s-image'])[1]"))).click();

        // Sayfayı kapatınız
        driver.close();

    }
}
