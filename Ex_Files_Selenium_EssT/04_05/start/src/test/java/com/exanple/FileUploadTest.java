package com.exanple;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FileUploadTest {
    @Test
    public void mainTest() {

        System.setProperty("webdriver.chrome.driver", "D:\\Opt\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        driver.quit();
    }
}
