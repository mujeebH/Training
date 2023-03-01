package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions actions = new Actions(driver);
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement Italy = driver.findElement(By.id("box106"));
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement Sk = driver.findElement(By.id("box105"));
		WebElement swedan = driver.findElement(By.id("box102"));
		WebElement stock = driver.findElement(By.id("box2"));
		actions.dragAndDrop(stock, swedan).perform();
		actions.dragAndDrop(Seoul, Sk).perform();
		actions.dragAndDrop(rome, Italy).perform();
	}

}
