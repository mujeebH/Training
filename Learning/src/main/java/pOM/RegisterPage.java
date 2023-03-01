package pOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
@FindBy(id="gender-male")
WebElement maleRadioButton;
@FindBy(id="gender-female")
WebElement femaleRadioButton;
@FindBy(id="FirstName")
WebElement firstnameTextField;
@FindBy(id="LastName")
WebElement lastnameTextField;
@FindBy(id="Email")
WebElement emailTextField;
@FindBy(id="Password")
WebElement passwordTextField;
@FindBy(id="ConfirmPassword")
WebElement confirmPasswordTextField;
@FindBy(id="register-button")
WebElement registerButton;

public void clickmaleRadioButton() {
	maleRadioButton.click();
}
public void clickfemaleRadioButton() {
	femaleRadioButton.click();
}
public void enterFirstName(String FirstName) {
	firstnameTextField.sendKeys(FirstName);
}
public void enterLastName(String lastName) {
	lastnameTextField.sendKeys(lastName);
}
public void enterEmail(String email) {
	emailTextField.sendKeys(email);
}
public void enterPassword(String password) {
	passwordTextField.sendKeys(password);
}
public void enterConfirmPassword(String confirmpassword) {
	confirmPasswordTextField.sendKeys(confirmpassword);
}
public void clickRegister() {
	registerButton.click();
}
}
