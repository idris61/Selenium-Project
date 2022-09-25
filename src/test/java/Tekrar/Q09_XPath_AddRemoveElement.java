package Tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q09_XPath_AddRemoveElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Asagidaki testi text’leri kullanarak locateedin
        //1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2-Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        //3-Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButton.isDisplayed()){
            System.out.println("DeleteButton test PASSED");
        }else{
            System.out.println("DeleteButton test FAILED");
        }

        //4-Delete tusuna basin
        deleteButton.click();

        //5-“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveElement.isDisplayed()) {
            System.out.println("Add/Remove Elements test PASSED");
        } else {
            System.out.println("Add/Remove Elements test FAILED");
        }

        driver.close();
    }
}
