package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pOM.DemoWelcomePage;

public class LoginDemoWebShop {
@Test
public void login() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait explicitWait=new WebDriverWait(driver,25);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com");
	DemoWelcomePage welcomePg
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("chaithra12031999@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Chandrappa@12");
	driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
	WebElement logOut=driver.findElement(By.linkText("Log out"));
	explicitWait.until(ExpectedConditions.visibilityOf(logOut));
}
}


