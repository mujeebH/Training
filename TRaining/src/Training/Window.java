package Training;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Downloads/MultipleWindow%20(4).html");
		driver.findElement(By.xpath("//input")).click();
		
		Thread.sleep(2000);
		String parentId = driver.getWindowHandle();
		Set<String> winId = driver.getWindowHandles();
		winId.remove(parentId);
		Thread.sleep(2000);
		for(String id:winId) {
			driver.switchTo().window(id);
			driver.close();
			Thread.sleep(2000);
		}
		
		driver.quit();
	}

}
