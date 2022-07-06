package tests;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

public class Testclass  {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webstaurantstore.com/plus/");

        Faker fake = new Faker();



    }


@Test
        public void verifytilte(){

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.webstaurantstore.com/plus/");

            Assert.assertEquals(driver.getCurrentUrl(),"https://www.webstaurantstore.com/plus/");
              driver.quit();
        }

@Test
        public void registertest1(){

             WebDriverManager.chromedriver().setup();
             WebDriver driver = new ChromeDriver();
             driver.get("https://www.webstaurantstore.com/plus/");

     Assert.assertEquals(driver.getCurrentUrl(),"https://www.webstaurantstore.com/plus/");




}


}


