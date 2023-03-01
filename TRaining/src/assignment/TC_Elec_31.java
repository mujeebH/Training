package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Elec_31 {
	//Validate that "sort" by dropdown should accept Name: A to Z
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
		Actions actions = new Actions(driver);
		WebElement ele2 = driver.findElement(By.partialLinkText("ELECTRONICS"));
		actions.moveToElement(ele2).perform();
		WebElement ele3 = driver.findElement(By.partialLinkText("Camera"));
		actions.moveToElement(ele3).click().perform();
		explicitWait.until(ExpectedConditions.titleContains("Camera"));
		WebElement orderby=driver.findElement(By.id("products-orderby"));
		Select orderDrp =new Select(orderby);
		orderDrp.selectByVisibleText("Name: A to Z");
		List<WebElement> nameSort=driver.findElements(By.xpath("//h2[contains(@class,'title')]/a"));
		for(WebElement w:nameSort) {
		System.out.println(w.getText());
		}
		driver.quit();

	}

}
