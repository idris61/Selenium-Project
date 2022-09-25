package Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05_TekrarTesti {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1.Yeni bir class olusturun(TekrarTesti)
        //2.Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsoldayazdirin.

        driver.get("https://www.youtube.com");
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title test PASSED");
        }else{
            System.out.println("Title test FAILED");
            System.out.println("Dogru Baslik : " + actualTitle);
        }

        //3.Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yiyazdırın.
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains("youtube")) {
            System.out.println("Url test PASSED");
        }else{
            System.out.println("Url test FAILED");
            System.out.println("Dogru Url : " + actualUrl);
        }
        Thread.sleep(2000);

        //4.Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com")    ;
        Thread.sleep(2000);

        //5.Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(2000);

        //6.Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(2000);

        //7.Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.manage().window().minimize();

        //8.Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9.Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains("Amazon")){
            System.out.println("Amazon Title test PASSED");
        }else{
            System.out.println("Amazon Title test FAILED");
            System.out.println("Amazon Dogru Baslik : " + actualTitle2);
        }

        //10.Sayfa URL'sinin https://www.amazon.com/olup olmadığını doğrulayın, degilse doğru URL'yiyazdırın
        String expectedUrl = "https://www.amazon.com/";
        String actualUrl2 = driver.getCurrentUrl();

        if (actualUrl2.equals(expectedUrl)){
            System.out.println("Amazon Url test PASSED");
        }else {
            System.out.println("Amazon Url test FAILED");
            System.out.println("Amazon dogru Url : " + actualUrl2);
        }
        //11.Sayfayi kapatin
        driver.close();

    }

}
