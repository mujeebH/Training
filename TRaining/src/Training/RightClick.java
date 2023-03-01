package Training;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		actions.contextClick(ele).perform();
		List<WebElement> ele1 = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]"));
		for (int i = 0; i < ele1.size(); i++) {
			actions.click(ele1.get(i)).perform();
			Alert ale = driver.switchTo().alert();
			System.out.println(ale.getText());
			ale.accept();
			actions.contextClick(ele).perform();
		}
		driver.quit();
	}

}
