package Tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Q12_RelativeLocators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // "https://www.diemol.com/selenium-4-demo/relative-locators-demo.html" adresine gidelim
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // Sayfadaki Berlin WebElement'ini relative locator kullanarak tıklayalım
        WebElement NYCWE = driver.findElement(By.id("pid3_thumb"));
        WebElement BayAreaWE = driver.findElement(By.id("pid8_thumb"));
        WebElement BerlinWE = driver.findElement(RelativeLocator.with(By.tagName("img")).below(NYCWE).toLeftOf(BayAreaWE));
        BerlinWE.click();
        Thread.sleep(3000);
        driver.close();
    }
}

        /*
        above()     –-> sabit bir öğenin üzerinde bulunan bir öğeyi veya öğeleri bulur
        below()     –-> sabit bir öğenin altında bulunan bir öğeyi veya öğeleri bulur
        near()      –-> sabit bir öğenin yakınında bulunan bir öğeyi veya öğeleri bulur
        toLeftOf()  –-> sabit bir öğenin solunda bulunan bir öğeyi veya öğeleri bulur
        toRightOf() –-> sabit bir öğenin sağında bulunan bir öğeyi veya öğeleri bulur
         */