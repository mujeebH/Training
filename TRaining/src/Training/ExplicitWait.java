package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver,25);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com");
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.partialLinkText("COMPUTERS"));
		//wait.until(ExpectedConditions.visibilityOf(ele));
		actions.moveToElement(ele).perform();
		
		WebElement ele1 = driver.findElement(By.partialLinkText("Notebooks"));
		actions.moveToElement(ele1).click().perform();
		WebElement ele2 = driver.findElement(By.partialLinkText("ELECTRONICS"));
		actions.moveToElement(ele2).perform();
		
		WebElement ele3 = driver.findElement(By.partialLinkText("Cell phones"));
		actions.moveToElement(ele3).click().perform();
		driver.quit();

	}

}
