package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.linkText("Register")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='pollanswers-1']")).getText());//for text
		System.out.println(driver.findElement(By.xpath("//label[@for='pollanswers-2']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='pollanswers-3']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@value='Search']")).getAttribute("value"));//
		//
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'search')]")).getAttribute("value"));
		driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("BHooik");
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'search')]")).getAttribute("value"));
		driver.quit();
	
	}

}
