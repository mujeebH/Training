package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativePath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.quit();
		
	}

}
