package com.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatepickerTest {
    @Test
    public void mainTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Opt\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/2020");
        Thread.sleep(3000);
        dateField.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        
        driver.quit();
    }
}