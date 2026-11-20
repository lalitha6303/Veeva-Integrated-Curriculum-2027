
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        Thread.sleep(2000);

        // Open another window
        driver.switchTo().newWindow(   //newwindow  method creates a new browse tab or window
                org.openqa.selenium.WindowType.TAB
        );

        driver.get("https://www.wikipedia.org");

        Thread.sleep(2000);

        // Close current window (Wikipedia tab)
        driver.close();

        System.out.println("Current tab closed");

        Thread.sleep(2000);

        // Close remaining windows and end session
        driver.quit();

        System.out.println("Browser session terminated");
    }
}
