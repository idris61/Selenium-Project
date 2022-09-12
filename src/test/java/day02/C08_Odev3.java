package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C08_Odev3 {

    public static void main(String[] args) throws InterruptedException {

        /*
        Bir class oluşturun: LoginTest
        Main method oluşturun ve aşağıdaki görevi tamamlayın.

        1- http://a.testaddressbook.com adresine gidiniz.

        2- Sign in butonuna basin

        3- email textbox,password textbox, and signin button elementlerini locate ediniz..

        4- Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        Username : testtechproed@gmail.com
        Password : Test1234!

        5- Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        6- Sayfada kac tane link oldugunu bulun.
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        Thread.sleep(2000);

        // 2- Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click(); // birkere kullanacağımız için atama yapmadık.direkt çalıştırdık.
        // driver.findElement(By.linkText("Sign in")).click(); // ""))

        // WebElement signInButton = driver.findElement(By.id("sign-in"));
        // signInButton.click();
        Thread.sleep(2000);

        // 3- email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTexbox = driver.findElement(By.id("session_email"));
        WebElement passwordTexbox = driver.findElement(By.id("session_password"));
        WebElement signinButton = driver.findElement(By.name("commit"));

        // 4- Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // Username : testtechproed@gmail.com
        emailTexbox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);

        // Password : Test1234!
        passwordTexbox.sendKeys("Test1234!");
        signinButton.click();
        Thread.sleep(2000);

        // 5- Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualUserId = driver.findElement(By.className("navbar-text"));
        String ExpectedUserId = "testtechproed@gmail.com";

        if (actualUserId.getText().equals(ExpectedUserId)) {
            System.out.println("Expected user id is displayed");
        }
        /*
        if(actualUserId.isDisplayed()){
            System.out.println("Expected user id is displayed"+ actualUserId.getText());
        }else System.out.println("Expected user testi FAILED");

        NOT : Bir webelementin üzerindeki yazıyı konsolda yazdırabilmek için getText methodu kullanılır.
         */

        // 6- “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement singoutElementi = driver.findElement(By.linkText("Sign out"));

        if (adressesElementi.isDisplayed()){
            System.out.println("adresses testi passed");
        }else System.out.println("adresses testi failed");

        if (singoutElementi.isDisplayed()){
            System.out.println("adresses testi passed");
        }else System.out.println("adresses testi failed");

        //7- Sayfada kac tane link oldugunu bulun
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayisi " + linklerListesi.size());
        System.out.println(linklerListesi);

        // 8- linkleri yazdiralim
        for (WebElement each: linklerListesi
        ) {
            System.out.println("Linkler : " + each.getText());
        }

        // 9- linkleri LAMBDA ile yazdıralım
        linklerListesi.forEach(t-> System.out.println(t.getText()));

        // 10- sayfayı kapatalım
        driver.close();



    }

}
