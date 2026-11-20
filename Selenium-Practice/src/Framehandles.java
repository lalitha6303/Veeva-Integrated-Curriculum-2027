import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Framehandles {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.switchTo().frame(1);
        driver.findElement(By.name("mytext2")).sendKeys("Hello");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.switchTo().frame(0);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",driver.findElement(By.linkText("Learn more")));
    }
}
