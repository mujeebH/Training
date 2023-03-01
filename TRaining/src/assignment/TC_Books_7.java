package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Books_7 {
	//Validate that "Display" dropdown should accept 4 products per page.
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait explicitWait=new WebDriverWait(driver,25);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chaithra12031999@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandrappa@12");
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
		WebElement logOut=driver.findElement(By.linkText("Log out"));
		explicitWait.until(ExpectedConditions.visibilityOf(logOut));
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		explicitWait.until(ExpectedConditions.titleContains("Books"));
		WebElement orderby=driver.findElement(By.id("products-pagesize"));
		Select orderDrp =new Select(orderby);
		orderDrp.selectByVisibleText("4");
		List<WebElement> priceSort=driver.findElements(By.xpath("//span[contains(@class,'actual-price')]"));
		System.out.println(priceSort.size());
		driver.quit();
	}

}
