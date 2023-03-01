package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Downloads/MultipleSelect.html");
		WebElement ele = driver.findElement(By.xpath("//option[text()='Opel']"));
		WebElement ele1 = driver.findElement(By.xpath("//option[text()='Audi']"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(ele1).click(ele).perform();
		

	}

}
