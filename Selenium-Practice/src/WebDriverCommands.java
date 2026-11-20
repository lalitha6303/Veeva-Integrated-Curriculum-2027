
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

    public static void main(String[] args) {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print page title
        System.out.println("Title: " + driver.getTitle());

        // Print current URL
        System.out.println("URL: " + driver.getCurrentUrl());

        // Close browser
        driver.quit();
    }
}
