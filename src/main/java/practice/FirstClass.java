package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe"); // webdriver’in turunu ve path’ini belirledik.
        WebDriver driver = new ChromeDriver(); // Chrome driverı oluşturduk
                                               // webdriver interface olduğundan constructor yok/obje oluşturamayız

        /*
        En temel haliyle bir otomasyon yapmak için Class'ımıza otomasyon için geçerli olan
        webdriver'in yerini göstermemiz gerekir.
        Bunun için java kütüpnahesinde System.setProperty() method'unu kullanırız ve method'un içine
        -- ilk olarak deriver'i yazarız.
        -- İkinci olarak onun fiziki yolunu kopyalarız.
         */

    }
}
