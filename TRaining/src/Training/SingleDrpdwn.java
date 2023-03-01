package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDrpdwn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/demo%20(1).html");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("standard_cars"));
		Select carsDrp =new Select(element);
		carsDrp.selectByIndex(5);
		Thread.sleep(2000);
		carsDrp.selectByValue("jgr");
		Thread.sleep(2000);
		carsDrp.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		driver.quit();
	}

}
