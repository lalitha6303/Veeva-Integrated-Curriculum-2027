import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;


import java.time.Duration;

public class WindowHandles {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("file:///E:/Veeva/SeleniumPractise/src/First.html");
        Thread.sleep(2000);
        driver.findElement(By.linkText("click1")).click();
        Thread.sleep(2000);
        Set<String>alladd= driver.getWindowHandles();
        System.out.println(alladd);
        for(String i:alladd)
        {
            driver.switchTo().window(i);
        }
        driver.findElement(By.linkText("click2")).click();



    }
}
