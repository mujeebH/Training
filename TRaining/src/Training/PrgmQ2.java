package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrgmQ2 {

	public static void main(String[] args) {
		
		/*launch browser
		click on major tabs */
		
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
	
		List<WebElement> links=driver.findElements(By.xpath("(//div[@class='top-menu-triangle']/../..)[1]/li/a"));
		for(WebElement w:links) {
			w.click();
			driver.navigate().back();
			
		}
		driver.quit();
	}

}
