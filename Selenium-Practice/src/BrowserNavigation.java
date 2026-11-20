
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

    public static void main(String[] args)throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Get title
        System.out.println("Title: " + driver.getTitle());
        Thread.sleep(3000);
        // Get current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Navigate to another website
        driver.navigate().to("https://www.wikipedia.org");
        Thread.sleep(3000);
        System.out.println("New Title: " + driver.getTitle());

        // Navigate backward
        driver.navigate().back();
        Thread.sleep(3000);
        // Navigate forward
        driver.navigate().forward();
        Thread.sleep(3000);
        // Refresh page
        driver.navigate().refresh();
        Thread.sleep(3000);
        // Close browser
        driver.quit();
    }
}
