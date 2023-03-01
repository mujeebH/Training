package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/demo%20(1).html");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.name("fname"));
		
		System.out.println(links.size());
		for(WebElement w:links) {
			w.sendKeys("bhoom");
			System.out.println(w.getAttribute("value"));
		}
	}

}
