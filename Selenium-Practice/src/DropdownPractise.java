//Non auto suggestive
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractise {

    public static void main(String[] args)
    {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
        dropdown.click();
           Select s =new Select(dropdown);
//                   s.selectByValue("sql");

//s.selectByIndex(1);
s.selectByVisibleText("C#");

    }
}

