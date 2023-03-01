package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathASgn3 {

	public static void main(String[] args) {
		//subscribe to newsletter
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("varun@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'subscribe')]")).click();
		driver.quit();
		
		
	}
}
