package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Elec_020 {
	//Validate user is able to select camera category under electronics
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		driver.get("https://demowebshop.tricentis.com");
		Actions actions = new Actions(driver);
		WebElement ele2 = driver.findElement(By.partialLinkText("ELECTRONICS"));
		actions.moveToElement(ele2).perform();
		WebElement ele3 = driver.findElement(By.partialLinkText("Camera"));
		actions.moveToElement(ele3).click().perform();
		explicitWait.until(ExpectedConditions.titleContains("Camera"));
		driver.quit();
	}

}
