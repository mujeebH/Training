package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDrpdw {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/demo%20(1).html");
		driver.manage().window().maximize();
		String select="BMW";
		WebElement element=driver.findElement(By.id("standard_cars"));
		
		Select carsDrp =new Select(element);
		List<WebElement> Cars=carsDrp.getOptions();
		for(int i=0;i<Cars.size();i++) {
			if(select.equals(Cars.get(i).getText())) {
				carsDrp.selectByVisibleText(select);
			}
		}
		System.out.println(carsDrp.getFirstSelectedOption().getText());
		System.out.println(element.getText());
		driver.quit();
		
	
		
	}

}
