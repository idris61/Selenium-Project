import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
        1- Amazon sayfasına gidiniz.
        2- Başlığın "Amazon" içerdiğini test ediniz.
        3- Url'nin "amazon" içerdiğini test ediniz.
        4- Sayfayı kapatınız.
         */

        driver.manage().window().maximize(); // açılan url sayfasını büyütmek için bunu alışkanlık haline getirmeliyiz
        // Amazon sayfasına gidiniz.
        driver.get("https://www.amazon.com");  // "Amazon" sayfasına gittik.

        // Başlığın "Amazon" içerdiğini test ediniz.
        String istenenKelime = "Amazon";

        String actualTitle = driver.getTitle(); // başlığa ulaştık
        if (actualTitle.contains(istenenKelime)) {
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        // Url'nin "amazon" içerdiğini test ediniz.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";
        if (actualUrl.contains(arananKelime)) {
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        // Sayfayı kapatınız.
        driver.close();

    }
}
