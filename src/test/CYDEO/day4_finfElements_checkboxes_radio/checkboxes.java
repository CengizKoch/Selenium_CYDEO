package day4_finfElements_checkboxes_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class checkboxes {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        System.out.println("checkbox1.isSelected()= " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected()=" + checkbox2.isSelected());



        try {
            extracted();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        checkbox1.click();


        checkbox2.click();

        System.out.println("checkbox1.isSelected()' expecting true = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected()' expecting false = " + checkbox2.isSelected());


    }

    private static void extracted1() throws InterruptedException {
        Thread.sleep(2000);
    }

    private static void extracted() throws InterruptedException {
        Thread.sleep(2000);
    }

}
