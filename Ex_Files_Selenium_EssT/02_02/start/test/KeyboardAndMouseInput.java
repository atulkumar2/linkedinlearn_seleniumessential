import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver",
        //         "D:\\Opt\\selenium-java-4.25.0");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        driver.findElement(By.id("name")).click();
        driver.findElement(By.id("name")).sendKeys("Rahul Shetty");
        driver.findElement(By.id("button")).click();
        // driver.wait(1000);

        driver.quit();
    }
}
