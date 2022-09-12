package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetMethodlari {
    public static void main(String[] args) {

        /*
        Amazon sayfasına gidiniz
        Arama kutusunu locate ediniz
        Arama kutusunun tagName inin input olduğunu test ediniz
        Arama kutusunun name atributu'nun "field-keywords" olduğunu test ediniz
        Sayfayı kapatınız
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

       // Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

       // Arama kutusunun tagName inin input olduğunu test ediniz
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("TagName Test PASSED" + actualTagName);
        }else System.out.println("TagName Test FAILED");

       // Arama kutusunun name atributu'nun "field-keywords" olduğunu test ediniz
        String expectedAtributuName = "field-keywords";
        String actualAtributuName = aramaKutusu.getAttribute("name");
        if(actualAtributuName.equals(expectedAtributuName)){
            System.out.println("Atributu Test PASSED");
        }else System.out.println("Atributu Test FAILED");

       // Sayfayı kapatınız
        driver.close();



        /*
        expectedTagName : Beklenen Etiket Ismi
        actualTagName   : Gercek Etiket Ismi

        expectedAttributeName :  Beklenen Baglanti Ismi
        actualAttributeName   :  Gercek Baglanti Ismi

        TAGNAME   ---> Her webelementin ilk siradaki ismidir ÖRNEK =INPUT
        ATRIBUTE ISE --->  id   ----value name --  dir --class--
        bunlarin icinde olanlar ise   atribute degerleridir .
         */
    }
}
