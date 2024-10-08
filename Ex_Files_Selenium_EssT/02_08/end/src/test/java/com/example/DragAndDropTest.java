package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DragAndDropTest {
    @Test
    public void mainTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Opt\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));

        Thread.sleep(5000);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, box).build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
