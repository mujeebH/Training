package SeleniumTestNg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLib.ToRead2D;

public class LoginDataProvider {

	@Test(dataProvider = "Data")
	public void log(String Email,String Password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait explicitWait=new WebDriverWait(driver,25);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
		WebElement logOut=driver.findElement(By.linkText("Lo out"));
		explicitWait.until(ExpectedConditions.visibilityOf(logOut));
		/*if(logOut.isDisplayed()) {
			System.out.println("Pass: User is logged in");
		}
		else {
			System.out.println("Fail: User is not logged in");
		}*/
		Assert.assertTrue(logOut.isDisplayed(), "Logout Button displayed is");
		driver.quit();
	}
	
	
	
	@DataProvider(name = "Data")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		return ToRead2D.testData("Sheet1");
	}

}
