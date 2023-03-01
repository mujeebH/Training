package Training;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win3SwitchBack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parentId = driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		Set<String> winId = driver.getWindowHandles();
		winId.remove(parentId);
		Thread.sleep(2000);
		for(String id:winId) {
			driver.switchTo().window(id);
			driver.close();
			Thread.sleep(2000);
		}
		driver.switchTo().window(parentId);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.quit();
	}
}
