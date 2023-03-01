package SeleniumTestNg;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SSWebEle {

	public static void main(String[] args) {
		LocalDateTime dateTime=LocalDateTime.now();
		String fileName=dateTime.toString().replace(":", "-");//filename cant have / \ : * ? | < > " these characters
		System.out.println(fileName);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait explicitWait=new WebDriverWait(driver,25);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		Assert.assertTrue(driver.getTitle().contains("Demo Web Shop"), "Title Verification");
		File sour=driver.findElement(By.xpath("//img")).getScreenshotAs(OutputType.FILE);//for webelement this methid is present in webelemnt class
		//foe webpage we shld give diver control to takess 
		/*TakesScreenshot ss=(TakesScreenshot)driver;
		File sour=ss.getScreenshotAs(OutputType.FILE);*/ //for web page
		File dest=new File("./ScreenShots/"+fileName+".png");
		try {
			FileHandler.copy(sour, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
