package day5_testEng_Intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

import java.security.PublicKey;

public class TestNG_Intro {


       @AfterClass
       public void tearDownClass(){
              System.out.println("AfterClass is running");
       }

       @BeforeClass
       public void setUpMethod(){
              System.out.println("BeforeMethod is running");
       }

       @BeforeMethod
       public void setUpmethod(){
              System.out.println("BeforeMethod is running");
       }
       @AfterMethod

       public void tearDownMethod(){
              System.out.println("AfterMethod is running");
       }

@Test
       public void test1() {
       System.out.println("Test 1 is running...");

       String actual = "apple";
       String expected = "apple";
       Assert.assertEquals(actual, expected);

       }
       @Test
       public void test2(){
              System.out.println("Test 2 is running...");

              String actual = "apple";
              String expected = "apple2";

              Assert.assertTrue(actual.equals(expected));

       }

}
