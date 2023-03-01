package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Books_184 {
	//Add book product to cart, click on checkout and fill the billing address tab
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait explicitWait=new WebDriverWait(driver,25);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chaithra12031999@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandrappa@12");
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
		WebElement logOut=driver.findElement(By.linkText("Log out"));
		explicitWait.until(ExpectedConditions.visibilityOf(logOut));
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		explicitWait.until(ExpectedConditions.titleContains("Books"));
		driver.findElement(By.xpath("//h2[contains(@class,'title')]/a")).click();
		//String selected_prdt=driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]"))));
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]")).click();
		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@class='content']"))));
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		WebElement CountryId=driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select CountryIdDrp =new Select(CountryId);
		CountryIdDrp.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bengaluru");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("#179 bhavani nagar main road");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560073");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9845678589");
		driver.findElement(By.xpath("//input[@title='Continue']")).click();
		String expected=driver.findElement(By.id("opc-shipping")).getAttribute("class");
		if("tab-section allow active".equals(expected))
			System.out.println("Shipping address tab got activated successfully");
		driver.quit();
	}

}
