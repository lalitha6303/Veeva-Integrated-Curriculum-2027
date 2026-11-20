import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class CheckBoxhandles {
    public static  void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaautomationlabs.com/testing/checkbox.php");

        driver.findElement(By.id("chk1")).click();

    }
}
