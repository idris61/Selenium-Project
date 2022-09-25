package Tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Q06_ClassWork_LoginTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1.Bir class oluşturun:LoginTest
        //2.Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a.http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b.Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();

        //c.email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTexbox = driver.findElement(By.id("session_email"));
        WebElement passwordTexbox = driver.findElement(By.id("session_password"));
        WebElement signinButton = driver.findElement(By.name("commit"));

        //d.Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in) buttonunu tıklayın:
        //i.Username :testtechproed@gmail.com
        emailTexbox.sendKeys("testtechproed@gmail.com");

        //ii.Password :Test1234!
        passwordTexbox.sendKeys("Test1234!");
        signinButton.click();

        //e.Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualUseId = driver.findElement(By.className("navbar-text"));
        String expectedUserId = "testtechproed@gmail.com";

        if (actualUseId.getText().equals(expectedUserId)) {
            System.out.println("User id test PASSED!");
        }else {
            System.out.println("User id test FAILED!");
        }

        //f.“Addresses” ve “Sign Out” textlerinin görüntülendiğini (displayed) doğrulayin (verify).
        WebElement adressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi = driver.findElement(By.linkText("Sign out"));

        if (adressesElementi.isDisplayed()){
            System.out.println("adressesElementi test PASSED!");
        }else {
            System.out.println("adressesElementi test FAILED!");
        }

        if (signOutElementi.isDisplayed()){
            System.out.println("signOutElementi test PASSED");
        }else{
            System.out.println("signOutElementi test FAILED");
        }

        //3.Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki link sayisi : " + linklerListesi.size());

        // linkleri yazdiralim
        for (WebElement each : linklerListesi) {
            System.out.println("Sayfadaki linkler : " + each.getText());
        }

        // lambda ile yazdıralım.
        linklerListesi.forEach(t-> System.out.println(t.getText()));

        // sayfayı kapatalım
        driver.close();


    }
}
