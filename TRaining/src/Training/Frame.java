package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		//iterator is a cointainer iterable is content
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.autocarindia.com/");
		//driver.switchTo().frame(0);
		driver.switchTo().frame("frame2");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
