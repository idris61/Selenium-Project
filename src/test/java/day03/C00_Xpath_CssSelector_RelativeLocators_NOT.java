package day03;

public class C00_Xpath_CssSelector_RelativeLocators_NOT {

     /*  /-/-/  By.xpath() Method;  /-/-/

    Bir WebElement’i locate etmek icin kullanabilecegimiz en etkinmethod’dur.
        WebElement passwordTextBox=driver.findElement(By.xpath(“xpath"));

    Method’un yazimi acisindan diger 6 yontem ile ayni olmakla beraber xpath’i digerlerinden ayiran cok onemli bir fark vardir.

    Diger 6 method HTML kod’una baglidir. Webelement’in kodunda id yoksa By.id( ) method’unu, web element link degilse By.linkText( ) method’unukullanamazsiniz.
    Xpath ise dinamiktir. Her turlu web element icin mutlaka bir xpath yazilabilir.

    2 cesit Xpath yazilabilir;

      1.Absolute xpath (mutlak);
    Absolute xpath yazmak icin en basa // sonraki her adimda / yazarak hedef web element’e kadar tum tag’lar yazilir.
    Eger ayni path’e sahip birden fazla element varsa index kullanilabilir. [2]gibi
    Eger bir parent’in grand child’lari icinde unique bir tag varsa parent // grand childyazilabilir.

    Öğeyi bulmanın doğrudan yoludur, ancak Absolute XPath’ın dezavantajı,
    öğenin yolunda herhangi bir değişiklik yapılması durumunda XPath’ın başarısız olmasıdır.
    Bu aslında tavsiye edilmeyen bir yoldur. Web üzerinde F12 tuşu ile inspect mode açılır.
    Elements bölümüne tıklanır. Öğe bulunduktan sonra yine sağ click ile Copy – Copy XPath seçilir.
     Aşağıda Absolute XPath örneğini görebilirsiniz.

       html/body/div[1]/section/div[1]/div/div/div/div[1]/div/div/div/div/div[3]/div[1]/div/h4[1]/

      2.Relative xpath(bağıl);
    Bir web element’te temel olarak 3 bilesenvardir.
        1 ) tag name        ==> input
        2 ) attribute       ==> type, id , value, name, autocomplete, placeholder, class….
        3 ) attributevalue  ==> type ➔‘text’,id➔‘twotabsearchtextbox’,value➔‘’

    Bu 3 bileseni birlikte kullanarak her bir webelement icin unique sonuc veren bir cok xpath yazilabilir
    Relative xpath yazmak icin bu 3 bilesen asagidaki gibi bir araya getirilir, unique sonuc veren
    her relative xpath kullanilabilir.

       //tagName[@attributeIsmi=‘attributeValue']

    ❖ Genelde 3 bilesen de kullanilir, Ancak bazen daha az bilesen yazmak da yeterli olabilir.
    Sadece tag name kullanarak xpath yazmakicin;
                driver.findElement(By.xpath(“//input”));

    Tag name farketmeksizin attribute ismi ve attribute value kullanarak xpath yazmak icin
                driver.findElement(By.xpath(“//*[@type=‘text’]”));

    Attribute name farketmeksizin tag name ve attribute value kullanarak xpath yazmakicin
                driver.findElement(By.xpath(“//input[@ *=‘text’]”));

    Attribute value farketmeksizin tag name ve attribute ismi kullanarak xpath yazmakicin
                driver.findElement(By.xpath(“//input[@type]”));

      */

     /*  /-/-/  By.cssSelector( ) Method;  /-/-/

     Css selector xpath'e benzer. Üç ana tipkullanılır;
    1) css = tagName[attribute name= 'value’];
             driver.findElement(By.cssSelector("input[name='session[password]']"));
    2) css="tagName#idValue" veya sadece css="#idValue" =>yalnızca id value ileçalışır
            driver.findElement(By.cssSelector("input#session_password"));
    3) css="tagName.classValue" veya sadece css=".classValue"=>yalnızca class value ileçalışır
            driver.findElement(By.cssSelector(".form-control"));
      */

    /*  /-/-/  Relative Locators nedir?  /-/-/

    ❖ Selenium 4 ile gelen yeniliklerden biri de bagil locator’lardir.
    ❖ Bir web elementi direk locate edemedigimiz durumlarda gunluk hayatimizda kullandigimiz sekilde
      o web elementi etrafindaki web elementlerin referansi ile tarif edebiliriz.

      WebElement boston = driver.findElement(By.id("boston"));
      WebElement sailor = driver.findElement(By.id("sailor"));

      WebElement berlin = driver.findElement(with(By.tagName("li")).above(sailor).toRightOf(boston));
      WebElement mountie = driver.findElement(with(By.className("ui-li-has-thub")).below(boston));

      WebElement BerlinWE = driver.findElement(RelativeLocator.with(By.tagName("img")).
                                                                below(NYCWE).
                                                                toLeftOf(BayAreaWE).
                                                                toRightOf(BostonWE));

        above()     –-> sabit bir öğenin üzerinde bulunan bir öğeyi veya öğeleri bulur
        below()     –-> sabit bir öğenin altında bulunan bir öğeyi veya öğeleri bulur
        near()      –-> sabit bir öğenin yakınında bulunan bir öğeyi veya öğeleri bulur
        toLeftOf()  –-> sabit bir öğenin solunda bulunan bir öğeyi veya öğeleri bulur
        toRightOf() –-> sabit bir öğenin sağında bulunan bir öğeyi veya öğeleri bulur

     */


}
