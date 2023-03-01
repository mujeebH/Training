package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrgmQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Books")).click();
		WebElement orderby=driver.findElement(By.id("products-orderby"));
		Select orderDrp =new Select(orderby);
		System.out.println(orderDrp.isMultiple());
		orderDrp.selectByVisibleText("Price: High to Low");
	//	System.out.println(orderby.getText());
		WebElement pagesize=driver.findElement(By.id("products-pagesize"));
		Select pagesizeDrp =new Select(pagesize);
		pagesizeDrp.selectByIndex(0);
		
		WebElement viewmode=driver.findElement(By.id("products-viewmode"));
		Select viewmodeDrp =new Select(viewmode);
		viewmodeDrp.selectByIndex(1);
		
		List<WebElement> prdts=driver.findElements(By.xpath("//div[@class='item-box']"));
		System.out.println(prdts.size());
		driver.quit();
	}

	
}
