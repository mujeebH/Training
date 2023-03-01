package SeleniumTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sample1 {
	@Test(groups="smoke",threadPoolSize=2,invocationCount=3
			)
	public void reg() {
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
		driver.quit();
	}
	@Test
	public void m1() {
		System.out.println("hello");
	}
	@Test(groups="smoke")
	public void m2() {
		System.out.println("bye");
	}
	@Test
	public void m3() {
		System.out.println("bye");
	}

}
