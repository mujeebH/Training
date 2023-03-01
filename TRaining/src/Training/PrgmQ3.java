package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrgmQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*launch browser
		click on login 
		enter email, password, click on login*/
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Bhoomi@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Bhoomi@12");
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
		driver.close();
	}

}
