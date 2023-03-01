package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		driver.get("https://demowebshop.tricentis.com");
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.partialLinkText("COMPUTERS"));
		Thread.sleep(2000);
		actions.moveToElement(ele).perform();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.partialLinkText("Notebooks"));
		actions.moveToElement(ele1).click().perform();
		WebElement ele2 = driver.findElement(By.partialLinkText("ELECTRONICS"));
		actions.moveToElement(ele2).perform();
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.partialLinkText("Cell phones"));
		actions.moveToElement(ele3).click().perform();
		driver.quit();
	}

}
