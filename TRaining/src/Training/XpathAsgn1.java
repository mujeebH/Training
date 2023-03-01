package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAsgn1 {

	public static void main(String[] args) {
		// Click on reg enter FN LN 
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Bhoomi");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("M C");
		driver.findElement(By.xpath("//input[contains(@id,'register')]")).click();
		driver.quit();
	}

}
