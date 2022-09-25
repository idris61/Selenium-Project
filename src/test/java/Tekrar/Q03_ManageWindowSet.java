package Tekrar;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03_ManageWindowSet {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1.Yeni bir Classolusturalim.C07_ManageWindowSet
        //2.Amazon soyfasina gidelim.https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3.Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutlari : " + driver.manage().window().getSize());

        //4.Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(10,10));
        driver.manage().window().setSize(new Dimension(900,600));

        //5.Sayfanin sizin istediginiz konum ve boyuta geldigini testedin
        System.out.println("Sayfanin yeni konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanin yeni boyutu : " + driver.manage().window().getSize());

        //8. Sayfayi kapatin
        driver.close();


    }
}
