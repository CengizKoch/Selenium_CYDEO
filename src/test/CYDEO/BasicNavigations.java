import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1- Setup the browser driver
        WebDriverManager.chromedriver().setup();
        //2- create instance of the Selenium WebDriver
        WebDriver driver = new ChromeDriver();
        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        // Stop code execution for 3 seconds
        Thread.sleep(300);

        // use selenium to navigate back
        driver.navigate().back();

    }
}
