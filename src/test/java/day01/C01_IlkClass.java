package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static <Webdriver> void main(String[] args) {

        /*
        En temel haliyle bir otomasyon yapmak için Class'ımıza otomasyon için geçerli olan
        webdriver'in yerini göstermemiz gerekir.
        Bunun için java kütüpnahesinde System.setProperty() method'unu kullanırız ve method'un içine
        ilk olarak deriver'i yazarız. İkinci olarak onun fiziki yolunu kopyalarız.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // webdriver interface olduğundan constructor yok/obje oluşturamayız

        driver.get("https://www.amazon.com"); // driver objesini kullanarak istediğimiz sayfaya gidebiliriz.

        System.out.println("Actual Title : " + driver.getTitle()); // gidilen sitenin başlığını yazdırır.
        System.out.println("Actual Url : " + driver.getCurrentUrl()); // gidilen sayfanın Url'ini getirir.
        System.out.println("Kaynak kodları : " + driver.getPageSource()); // sayfanın kaynak kodlarını string olarak getirir.


    }
}
