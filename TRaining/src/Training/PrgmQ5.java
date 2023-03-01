package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrgmQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*launch browser
		click on search
		enter mobile in search field
		like on advance search 
		click on all check box
		retrive error msg
		click on search
		*/
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
		driver.findElement(By.id("As")).click();
		driver.findElement(By.id("Isc")).click();
		driver.findElement(By.id("Sid")).click();
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'No products')]")).getText());
		driver.findElement(By.xpath("//input[contains(@class,'search-button')]")).click();
		driver.quit();
	}

}
