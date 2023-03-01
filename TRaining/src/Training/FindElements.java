package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//li//a"));
		System.out.println(links.size());
		for(WebElement w:links) {
			System.out.println(w.getText());
		}
		System.out.println("*******************");
		List<WebElement> link=driver.findElements(By.xpath("//a"));
		System.out.println(link.size());
		for(WebElement w:link) {
			System.out.println(w.getText());
		}
	}

}
