package day02;

public class C00_Not_Locators_WebElementMethodlari {
    public static void main(String[] args) {

        /*
    Locator (konum belirleyici) : bir web sitesindeki herhangi bir webElementi driver’a tarif etme yontemidir.

    - Bunun icin webElementi’n HTML kodlarindaki ozelliklerini kullanir.

    webElement : Bir web uygulamasinda kullanilan etkilesimli veya etkilesimsiz her sey bir webElement’tir.

    - Calistigimiz web uygulamasindan kullanmak istedigimiz her bir webElement’i locator ile belirleyip,
      Selenium’da olusturacagimiz bir webElement’e assign ederiz.

    - Locate islemi icin driver ile findElement( ) veya findElements( ) method’larini kullanabiliriz.

    - Bir web sayfasindaki HTML (HyperText Markup Language – Kelime İşaretleme Dili) kodlarini gormek icin,
      o sayfanin herhangi bir yerinde sag click yapip inspect/incele demeniz yeterlidir.

    Her bir HTML ogesi temelde 3 unsurdan olusur;

    1- tag (etiket) : Bir HTML etiketi(tag), bir HTML öğesinin başlangıcını ve sonunu belirtmek için kullanılan
                      bir işaretleme dili parçasıdır.
                      <script>  --> baslangic
                      </script> --> bitis

    2- attribute   :  Bir HTML attribute’u, HTML ogenin davranislarini kontrol etmek uzere acilis tag’i
       (nitelik)      icine yazilan ozel kelimelerdir.

                      Attribute’ler class, name, id gibi ortak kullanilan isimler olabilecegi gibi,
                      developer’in belirleyecegi isimlerde de olabilir.

    3- attribute value :  HTML'deki value , birlikte kullanıldığı öğenin değerini belirtmek için kullanılır.
      (nitelik değeri)    Farklı HTML öğeleri için farklı anlamlara sahip olabilir.

        NOT: Birden fazla HTML oge icin ayni tag, attribute ve attribute value kullanilabilir.

        - Locate islemi ise unique (benzersiz) olmalidir.

        - Locate unique (benzersiz) olmazsa driver islem icin kendisine locate edilen elementlerden hangisine
          gidecegini bilemeyecegi icin NoSuchElementExeption verecek ve islemi yapmayacaktir.

        - Ozetle, LOCATE islemi, birbirine benzer ozelliklerde olabilen HTML ogesini UNIQUE olarak belirleme islemidir.

    Selenium’da kullanilan 8 adet locator vardir;

    1- id  : id en güvenli ve en hızlı locator seçeneği olarak kabul edilir ve her zaman birden çok locator arasında
    ilk öncelik olarak denenir.

             WebElement aramaKutusu =driver.findElement(By.id (“twotabsearchtextbox"));

        - id genelde unique olarak kullanilsa da developer’lar unique yapmayabilir, locator olarak id sececeksek
          unique oldugundan emin olmamiz gerekir.

    2- name :

            WebElement aramaKutusu = driver.findElement(By.name (“field-keywords"));

    3- classname : Class attribute’u genelde ayni islevi yapan bir grup Web Elementi tanimlamak icin kullanilir ve unique olmaz.

            WebElement aramaKutusu = driver.findElement(By.classname (“nav-input nav-progressive-attribute"));

        - Class attribute’nun degeri bosluk iceriyorsa, By.classname( ) ile yapilan locator’lar saglikli calismayabilir.

    4- tagname  : Tag isimleri genelde ayni oldugundan unique degere ulasmak zordur.
            Çoğunlukla öğelerin bir listesini almak için kullanılır. Bu nedenle findElements() yöntemiyle kullanılmasıönerilir.
            Örneğin, kullandığımız bir sayfadaki tüm linkleri döndürmek için By.tagName(“a") kullanilabilir

    5- linkText : Kullanacagimiz webElement bir link ise uzerindeki yazinin tamamini kullanarak locate edebiliriz.

            WebElement aramaKutusu = driver.findElement(By.linkText (“Addresses"));

        - Link uzerindeki bir String oldugundan buyuk,kucuk harf, bosluk gibi durumlara dikkat edilmelidir.

    6- partialLinkText  : Link uzerindeki yazinin tamami degil bir kismini kullanarak da unique bir sonuca
                          ulasabiliyorsak partialLinkText kullanilabilir.

            WebElement aramaKutusu = driver.findElement(By.partiaLlinkText (“esses"));

    7- xpath( ) : En guclu locator’dir ve tum webElementleri unique olarak belirleyebilir.
                  //tagName[@attributeIsmi=‘attributeValue']

        - WebElement’te kullanilan tag, attribute ve attribute-value ogelerinin birlikte kullanilmasiyla olusur.

            WebElement aramaKutusu = driver.findElement(By.xpath (“//input[@type=‘text’]"));

    8- cssSelector( ) : Xpath’e benzer ve tum webElementler icin kullanilabilir. Farki xpath’de kullandigimiz
                        // ve @ isaretinin kullanilmamasidir.  tagName[attributeIsmi=‘attributeValue']

        - Eger kullanilacak attribute id veya class ise pratik olarak yazilabilir

            WebElement aramaKutusu = driver.findElement(By.cssSelector ("#twotabsearchtextbox’]"));
                                     driver.findElement(By.cssSelector (".nav-input nav-progressive-attribute]"));

    NOT :   findElement( )Method ;

            WebElement elementName = driver.findElement(By.LocatorStrategy("LocatorValue"));

            ❖ Driver’in bir elementi bulmasi için findElement( ) yönteminikullanırız.
            ❖ Bu, tek bir web elementini döndürür.
            ❖ Driver elementi bulamazsa, runtime exception VERİR :NoSuchElementException.
            ❖ NoSuchElementException'ı gördüğünüzde, locatorı tekrar kontrol etmelisiniz.

            findElements( )Method ;

            List<WebElement>elementName = driver.findElements(By.LocatorStrategy("LocatorValue"));

            ❖ Locator degerine uygun Web elementlerinin listesini döndürür
            ❖ Locator stratejisiyle eşleşen web elementi yoksa boş bir liste döndürür.
            ❖ NoSuchElementException hatası VERMEZ.
            ❖ Listedeki her Web elementi, 0'dan başlayan bir indeks alır.,
  //------------------------------------------------------------------------------------------------------------------//

                        //-/-/      WebElementMethod’lari      /-/-/
                        --------------------------------------------
        webElement.click();                         ==> Web Element’e click yapar
        webElement.sendKeys(“Metin” );              ==> Parametre olarak yazilan metni Web Elemente gonderir
        webElement.submit();                        ==> Web element ile islem yaparken Enter tusuna basma gorevi yapar
        webElement.sendKeys(“Metin” + Keys.ENTER ); ==> Istedigimiz metni yollayip, sonra ENTER’abasar.

        NOT : Bir webelementin üzerindeki yazıyı konsolda yazdırabilmek için getText methodu kullanılır.

        WebElement GetMethod’lari;
        --------------------------
        webElement.getText();                   ==> Web Element uzerindeki yaziyi getirir
        webElement.getAttribute(“Att.ismi” );   ==> Ismi girilen attribute’un degerini getirir
        webElement.getTagName();                ==> Web elementin tag ismini getirir

        WebElement IsMethod’lari;
        ------------------------
        webElement.isEnable();              ==> Web Element erisilebilir ise true yoksa false doner
        webElement.isDisplayed();           ==> Web Element gorunur ise true yoksa false doner
        webElement.isSelected( );           ==> Web Element secili ise true yoksa false doner

        Not : Web element ile ilgili bu method’larin disinda size, istenen CSS ozelligi, Location,
              Rect.geometrik ozellikler, DOM degeri vb.. Bir cok method vardir ama Automation Test icin kullanmiyoruz



         */


    }


}
