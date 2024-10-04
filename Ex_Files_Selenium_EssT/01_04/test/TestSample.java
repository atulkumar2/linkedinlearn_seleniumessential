import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TestSample {
    @Test
    public void mainTest() {

        // Set the property for webdriver.chrome.driver to be the location to your local
        // download of chromedriver
        System.setProperty("webdriver.edge.driver",
                "D:\\Opt\\selenium-java-4.25.0\\selenium-edge-driver-4.25.0.jar");

        // Create new instance of ChromeDriver
        WebDriver driver = new EdgeDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form
        element.submit();

        // Close the browser
        driver.quit();
    }
}
