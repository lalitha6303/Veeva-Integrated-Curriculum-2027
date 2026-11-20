
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPractise {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");

        // Locate hyperlink using complete visible text
//        WebElement link = driver.findElement(
//                By.linkText("A/B Testing")
//        );
        driver.findElement(By.partialLinkText("A/B")).click();

        // Click the hyperlink
//        link.click();


        Thread.sleep(3000);

        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.quit();
    }
}
