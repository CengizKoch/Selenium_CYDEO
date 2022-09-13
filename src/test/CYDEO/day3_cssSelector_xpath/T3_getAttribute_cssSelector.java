package day3_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://login1.nextbasecrm.com/");

        //WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit'']"));
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButton = "Log in";
        String actualButtonText = signInButton.getAttribute("value");
        System.out.println("actualButtonText = " + actualButtonText);

        if(actualButtonText.equals(expectedButton)){
            System.out.println("Log In button text verification passed");
        }else{
            System.out.println("Log In button text verification failed");
        }



    }
}
