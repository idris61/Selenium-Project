import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle()); // CDwindow-98F2A243B5D39883BD9ED067D89D36AD
        // farklı pencereler arasında gezinebilmek için getWindowHandle() methodunu kullanırız.
    }
}
