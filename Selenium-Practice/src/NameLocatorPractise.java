
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorPractise {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Locate username using Name Locator
        driver.findElement(By.name("username")).sendKeys("student");

        Thread.sleep(2000);

        // Locate password using Name Locator
        driver.findElement(By.name("password")).sendKeys("Password123");

        Thread.sleep(3000);

        driver.quit();
    }
}
