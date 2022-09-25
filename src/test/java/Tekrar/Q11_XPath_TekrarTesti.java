package Tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Q11_XPath_TekrarTesti {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1-C01_TekrarTesti isimli bir class olusturun
        //2-https://www.amazon.com/adresine gidin
        driver.get("https://www.amazon.com/");

        //3-Browseri tam sayfa yapin
        driver.manage().window().fullscreen();

        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        driver.manage().window().maximize();

        //5-Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Spend less")) {
            System.out.println("Actual Title test PASSED");
        } else {
            System.out.println("Actual Title test FAILED");
        }

        //6-Gift Cards sekmesine basin
        driver.findElement(By.xpath("(//*[text()='Gift Cards'])[1]")).click();

        //7-Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();

        //8-Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();

        //9-Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();

        //10-Urun ucretinin 25$ oldugunu testedin
        List<WebElement> urunUcretiListi = driver.findElements(By.xpath("//*[@id='gc-live-preview-amount']"));
        String urunUcreti = urunUcretiListi.get(0).getText();
        System.out.println(urunUcreti);

        String [] urunUcretiArr = urunUcreti.split("");
        System.out.println(urunUcretiArr[1]+urunUcretiArr[2]+urunUcretiArr[0]);

        if ((urunUcretiArr[1]+urunUcretiArr[2]+urunUcretiArr[0]).equals("25$")) {
            System.out.println("Urun Ucreti Testi PASSED");
        } else {
            System.out.println("Urun Ucreti Testi FAILED");
        }

        //11-Sayfayi kapatin
        driver.close();

    }
}
