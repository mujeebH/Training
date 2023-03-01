package Training;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win4ParticularWindowClose {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Downloads/MultipleWindow%20(4).html");
		driver.findElement(By.xpath("//input")).click();
		Thread.sleep(2000);
		Set<String> winId = driver.getWindowHandles();
		String title = "Olive Garden Italian Restaurant | Family Style Dining | Italian Food";
		Thread.sleep(2000);
		for (String id : winId) {

			driver.switchTo().window(id);
			Thread.sleep(3000);
			String v = driver.getTitle();
			if (v.equals(title)) {

				driver.close();
			}

			driver.quit();
		}
	}
}
