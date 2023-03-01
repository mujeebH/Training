package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathASgn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[contains(@id,'poll')])[2]")).click();
		driver.findElement(By.xpath("(//input[contains(@id,'poll')])[5]")).click();
		driver.quit();
	}

}
