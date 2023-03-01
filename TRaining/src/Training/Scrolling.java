package Training;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.END).perform();
		/*actions.sendKeys(Keys.ALT,Keys.F4).perform();
		//actions.keyDown(Keys.F4).perform();//not performing the action why
		//driver.quit();
		Thread.sleep(2000);
		actions.release().perform();*/
	}
}

