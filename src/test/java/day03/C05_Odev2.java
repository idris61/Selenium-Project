package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_Odev2 {

    /*  Class Work : R elative L ocators
    1 ) https://www.diemol.com/selenium 4 demo/relative locators demo.html adresine gidin
    2 ) Berlin’i 3 farkli relative locator ile locate edin
    3 ) Relative locator’larin dogru calistigini test edin

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1) "https://www.diemol.com/selenium-4-demo/relative-locators-demo.html" adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // 2) Berlin’i 3 farkli relative locator ile locate edin
        WebElement BostonWE = driver.findElement(By.id("pid6_thumb"));
        WebElement NYCWE = driver.findElement(By.id("pid3_thumb"));
        WebElement BayAreaWE = driver.findElement(By.id("pid8_thumb"));

        WebElement BerlinWE = driver.findElement(RelativeLocator.with(By.tagName("img")).below(NYCWE).toLeftOf(BayAreaWE).toRightOf(BostonWE));

        // 3) Relative locator’larin dogru calistigini test edin

        System.out.println(BerlinWE.getAttribute("id")); // pid7_thumb ==> id'nin Attribute'i
        // pid7_thumb --> kodu çalıştırınca bu çıktıyı verdi dolayısyla doğru locate ettiğimizi test etmiş olduk.


    }
}
