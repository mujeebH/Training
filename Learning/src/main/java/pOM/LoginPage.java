package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	WebElement emailTextField;
	@FindBy(id="Password")
	WebElement passwordTextField;
	@FindBy(id="RememberMe")
	WebElement rememberCheckbox;
	@FindBy(xpath = "//input[contains(@class,'login-button')]")
	WebElement loginButton;
	
	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}
	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	public void checkRememberMe() {
		rememberCheckbox.click();
	}
	public void clickLogin() {
		loginButton.click();
	}
}
