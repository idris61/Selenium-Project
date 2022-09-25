package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C00_Not_DriverMethodlari {

    /*
    Eclipse, IntelliJ ==>>  IDE(integrated development environment)
                            IDE, yazılım geliştirme için kapsamlı olanaklar sağlayan bir yazılım uygulamasıdır.
    Java     ==>> Yazilim dili
    HTML     ==>> Markup language
    Selenium ==>> Web sayfasi aplikasyonlarini farklı tarayıcılarda ve dillerde test
                  etmemize yardimci olan bir tooldur(aractir).
                  Selenium, otomasyon yapmak  için kendi sınıflarına ve yöntemlerine sahip bir kütüphanedir.
    Maven    ==>> Maven bir Java derleme aracıdır (build tool).
                  Maven proje otomasyon ve yönetim aracıdır (automation and management tool).
    JUnit    ==>> Bir test framework(test cercevesi) cesididir.Bir test kutuphanesidir.
    TestNG   ==>> Bir test framework(test cercevesi) cesididir.Bir test kutuphanesidir.
                  İsmi Next Generation Test kelimelerinden türetilmiştir.Junit’in yeni versiyonudur.

    Cucumber ==>> BDD(Davranış güdümlü geliştirme) yaklaşımı için kullanılmakta olan açık kaynak
                  kodlu bir kütüphanedir.
     */
    /*
     En ilkel haliyle bir otomasyon yapmak icin;
     Class'imiza otomasyon icin gerekli olan webdriver'in yerini gostermemiz gerekir
     bunun icin Java kutuphanesinden System.setProperty() methodu kullaniriz, method 2 parametre istemektedir
      -- ilki kullanacagimiz driver : webdriver.chrome.driver
      -- ikincisi ise bu driverin fiziki yolu : "src/resources/drivers/chromedriver.exe"
  */
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // webdriver interface olduğundan constructor yok/obje oluşturamayız


        //============================================================================================================//

                            //-/-/    DRIVER GET METHODLARI  /-/-//

        // (Adından da anlaşılacağı üzere, istediğimiz verileri bize GETİRECEK...)

        // 1- driver.get("url") --> yazdigimiz url'e gider
        driver.get("https://www.amazon.com");  // https'i mutlaka yazmalıyız.!!!

        // 2- driver.getTitle() --> icinde oldugu sayfanin basligini döndürür
        System.out.println("sayfa title : " + driver.getTitle()); // Amazon.com. Spend less. Smile more.

        // 3- driver.getCurrentUrl() --> icinde oldugu sayfanin URL'ini döndürür
        System.out.println(driver.getCurrentUrl()); // https://www.amazon.com/

        // 4- driver.getPageSource() --> icinde oldugu sayfanin kaynak kodlarini döndürür
        System.out.println("=====================================================");
       // System.out.println(driver.getPageSource()); // arka planda calisan sayfa kodlarini yazdirir
        System.out.println("=====================================================");

        // 5- driver.getWindowHandle() --> icinde oldugu sayfanin UNIQUE hash kodunu döndürür
        System.out.println(driver.getWindowHandle()); // CDwindow-EF373ECAC888CA68C9086B3DB6F9B741

        // 6- driver.getWindowHandles() --> driver calisirken acilan tum sayfalarin UNIQUE hash kodunu döndürür

        /* NOT : driver.getTitle(), driver.getCurrentUrl(), driver.getPageSource(), driver.getWindowHandle() methodları
                 bize String döndürdüğü için;
                 * ya String bir variable'a atama yapmalıyız,
                 * ya da yazdırmalıyız.
         */

        //============================================================================================================//

                              //-/-/    DRIVER NAVIGATE METHODLARI  /-/-//

        // Web sayfaları arasında DOLAŞACAKSAK navigate methodlarını kullanırız.

        // 1- driver.navigate().to("url") --> istenen url'e gider, ama forward ve back yapilmasina imkan tanir
        //    driver.get("url") --> ayni islemi yapar fakat sadece urel'e gider.
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        // 2- driver.navigate().back(); --> bir onceki sayfaya donus yapar
        driver.navigate().back(); // ornegimizde amazon'a donus yapacaktir

        // 3- driver.navigate().forward(); --> back() ile geldigi sayfaya yeniden gider
        driver.navigate().forward(); // ornegimizde facebook'a donus yapacaktir

        // 4- driver.navigate().refresh(); --> icinde oldugu sayfayi yeniler
        driver.navigate().refresh();

        // driver olusturuldugunda acilan sayfayi kapatmak istersek
        //driver.close();

        // driver calisirken birden fazla tab veya window actiysa tumunu kapatmak icin
        //driver.quit();

        // driver.close(); ve driver.quit(); methodları aynı anda çalışmaz.!!!

        //============================================================================================================//

                            //-/-/    DRIVER MANAGE METHODLARI  /-/-//

        driver.get("https://www.amazon.com");

        // 1- driver.manage().window() method'lari

        // 1 A - driver.manage().window().getSize() --> icinde oldugu sayfanin pixel olarak olculerini döndürür
        System.out.println(driver.manage().window().getSize()); // (1619, 869) pixel
        System.out.println(driver.manage().window().getSize().height); // 869

        // 1-B driver.manage().window().getPosition() --> icinde oldugu sayfanin pixel olarak konumunu döndürür
        System.out.println(driver.manage().window().getPosition()); // (-8, -8)

        // 1-C driver.manage().window().setPosition(new Point(15,15));
        //     icinde oldugu sayfanin sol alt kosesini bizim yazacagimiz pixel noktasina tasir
        driver.manage().window().setPosition(new Point(15,15));
        Thread.sleep(3000);

        // 1-D driver.manage().window().setSize(new Dimension(900,600));
        // icinde oldugu sayfanin sol alt kosesi sabit olarak bizim yazacagimiz olculere getirir
        driver.manage().window().setSize(new Dimension(900,600));
        Thread.sleep(3000);

        // konumu ve boyutu yeniledikten sonra tekrar yazdirirsak
        System.out.println("yeni pencere olculeri : " + driver.manage().window().getSize()); // (902, 602)
        System.out.println("yeni pencere konumu : " + driver.manage().window().getPosition()); // (13, 13)


        // 1-E driver.manage().window().maximize(); --> icinde oldugu sayfayi maximize yapar
        // 1-F driver.manage().window().fullscreen(); --> icinde oldugu sayfayi fullscreen yapar

        // farklarini gormek icin bu method'lari kullanip, baslangic noktalarini ve boyutlarini yazdiralim
        driver.manage().window().maximize();
        System.out.println("maximize konum : " + driver.manage().window().getPosition()); // (-8, -8)
        System.out.println("maximize boyut : " + driver.manage().window().getSize()); // (1616, 868)
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : " + driver.manage().window().getPosition()); // (0, 0)
        System.out.println("fullscreen boyut : " + driver.manage().window().getSize()); // (1603, 902)
        Thread.sleep(3000);

        // 1-G driver.manage().window().minimize(); --> sayfayi simge durumunda kucultur
        driver.manage().window().minimize();

        // 2- driver.manage().timeouts() methodlari

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*      wait konusunu ilerde tek basina ele alacagiz
                ancak her class icin yapmamiz gereken bir ayar oldugu icin burada kisaca deginelim
                implicitlyWait : driver'a sayfanin yuklenmesi ve kullanacagimiz webelementlerin bulunmasi icin
                                 bekleyecegi maximum sureyi belirtir.
                                 driver bu sure icerisinde sayfa yuklenir/web element bulunursa
                                 beklemeden calismaya devam eder.
                                 bu sure bittigi halde sayfa yuklenememis/webElement bulunamamissa
                                 exception vererek calismayi durdurur

                Duration.ofSeconds(15) : Duration class'i Selenium-4 ile gelen zaman class'idir
                                         Yani driver'a ne kadar bekleyecegini soyler
                                         Duration.ofSeconds(15) yerine milis,minutes,hours da kullanilabilir
         */

        /* NOT :    Driver'in istedigimiz islemleri yaparken sorunla karsilasmamasi icin
                    driver.manage() method'larindan
                    maximize() ve implicitlyWait() method'larinin her test'te kullanilmasi
                    FAYDALI OLACAKTIR
                            /*
            NOT : *** implicitlyWait yazmazsak sistem sağlıklı çalışmaz.
                  *** 1- Web sayfası açıldığında load (yükleme) için bekliyor.
                  *** 2- Locate'ler için bekliyor. Bunun için her class başında mutlaka yazalım.
         */

        //============================================================================================================//




    }
}
