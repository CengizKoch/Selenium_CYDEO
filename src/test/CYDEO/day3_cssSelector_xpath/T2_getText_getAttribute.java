package day3_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login.nextbasecrm.com/");

      WebElement rememberMeLabel = driver.findElement(By.xpath("//label[@class='login-item-checkbox-label']"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();
        if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification passed");
        }else{
            System.out.println("Lebel verification failed");
        }

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLink = "Forgot your password";
        String actualForgotPasswordLink = forgotPasswordLink.getText();

        if(actualForgotPasswordLink.equals(expectedForgotPasswordLink)){
            System.out.println("Forgot password link verification passed");
        }else{
            System.out.println("Forgot password link verification failed");
            System.out.println("actualForgotPasswordLink = " + actualForgotPasswordLink);
            System.out.println("expectedForgotPasswordLink = " + expectedForgotPasswordLink);
        }

        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");
        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if(actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute value verification passed");
        }else{
            System.out.println("HREF attribute value verification failed");
        }


    }


}
