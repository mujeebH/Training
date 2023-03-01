package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Books_179 {
	//Validate that user is able to register, login the demo web shop
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait explicitWait = new WebDriverWait(driver, 25);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Bhoomika");
		driver.findElement(By.id("LastName")).sendKeys("M C");
		driver.findElement(By.name("Email")).sendKeys("chaithra12031999@gmail.co");
		driver.findElement(By.id("Password")).sendKeys("Chandrappa@12");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Chandrappa@12");
		driver.findElement(By.id("register-button")).click();
		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'registration completed')]"))));
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chaithra12031999@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandrappa@12");
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
		WebElement logOut = driver.findElement(By.linkText("Log out"));
		explicitWait.until(ExpectedConditions.visibilityOf(logOut));
		driver.quit();
	}

}
