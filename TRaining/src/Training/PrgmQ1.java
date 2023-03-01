package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrgmQ1 {

	public static void main(String[] args) {
		/*launch browser
		click on register
		enter all the textfields get the error msg on console*/
		
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Bhoomi");
		driver.findElement(By.id("LastName")).sendKeys("M C");
		driver.findElement(By.id("Email")).sendKeys("Bhoomi@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Bhoomi@12");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Bhoomi@12");
		driver.findElement(By.id("register-button")).click();
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'exists')]")).getText());
		//div[contains(@class,'errors')]/ul/li
		driver.quit();
	}

}
