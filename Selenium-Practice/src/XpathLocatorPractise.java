package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorPractise{

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.get("file:///C:/Users/udayk/OneDrive/Desktop/HTML/index.html");
      //  System.out.println(driver.findElement(By.xpath("//h1[contains(text(), 'Welcome')]")).getText());



		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//input[@name='username']"))
		.sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		String actualOutput = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"))
		.getText();
		System.out.println(actualOutput);

//        driver.findElement(By.xpath("/html/body/input[1]"))
//		.sendKeys("Raju");
//		driver.findElement(By.xpath("/html/body/input[2]"))
//		.sendKeys("Ramu");driver.findElement(By.xpath("/html/body/input[3]"))
//	.sendKeys("John");
//	driver.findElement(By.xpath("//input[1]"))
//		.sendKeys("Raju");
//		driver.findElement(By.xpath("//input[2]"))
//		.sendKeys("Ramu");
//		driver.findElement(By.xpath("//input[3]"))
//	.sendKeys("John");

        Thread.sleep(3000);
        driver.close();
    }

}