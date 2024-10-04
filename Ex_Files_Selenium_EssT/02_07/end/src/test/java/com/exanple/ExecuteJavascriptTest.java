import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExecuteJavascriptTest {
    @Test
    public void mainTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Opt\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");
        Thread.sleep(5000);
        
        // Click on the modal button to open the modal
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closeButton);

        Thread.sleep(5000);
        driver.quit();
    }
}
