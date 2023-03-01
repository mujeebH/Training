package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_Books_185 {
	// Add Book product to cart and remove product from shopping cart
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait explicitWait = new WebDriverWait(driver, 25);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chaithra12031999@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandrappa@12");
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
		WebElement logOut = driver.findElement(By.linkText("Log out"));
		explicitWait.until(ExpectedConditions.visibilityOf(logOut));
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		explicitWait.until(ExpectedConditions.titleContains("Books"));
		driver.findElement(By.xpath("//h2[contains(@class,'title')]/a")).click();
		String selected_prdt = driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]")).click();
		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@class='content']"))));
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		explicitWait.until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//tr[contains(@class,'cart')]//a"))));
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		driver.quit();
	}
}
