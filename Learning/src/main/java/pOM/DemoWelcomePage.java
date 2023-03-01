package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWelcomePage {
	public DemoWelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Register")
	WebElement registerLink;
	@FindBy(partialLinkText = "Log in")
	WebElement loginLink;
	@FindBy(xpath = "//span[contains(text(),'Shopping')]")
	WebElement shoppingLink;
	@FindBy(xpath = "//span[text()='Wishlist']")
	WebElement wishlistLink;
	@FindBy(id="small-searchterms")
	WebElement searchTextField;
	@FindBy(xpath = "//input[contains(@class,'search-box-button')]")
	WebElement searchButton;
	
	@FindBy(partialLinkText = "BOOKS")
	WebElement books_nav;
	@FindBy(partialLinkText = "COMPUTERS")
	WebElement computer_nav;
	@FindBy(partialLinkText = "ELECTRONICS")
	WebElement electronics_nav;
	@FindBy(partialLinkText = "APPAREL")
	WebElement apparel_shoes_nav;
	@FindBy(partialLinkText = "DIGITAL")
	WebElement digital_downloads_nav;
	@FindBy(partialLinkText = "JEWELRY")
	WebElement jewelry_nav;
	@FindBy(partialLinkText = "GIFT")
	WebElement gift_card_nav;
	@FindBy(partialLinkText = "Books")
	WebElement books_cat;
	@FindBy(partialLinkText = "Computers")
	WebElement computer_cat;
	@FindBy(partialLinkText = "Electronics")
	WebElement electronics_cat;
	@FindBy(partialLinkText = "Apparel")
	WebElement apparel_shoes_cat;
	@FindBy(partialLinkText = "Digital")
	WebElement digital_downloads_cat;
	@FindBy(partialLinkText = "Jewelry")
	WebElement jewelry_cat;
	@FindBy(partialLinkText = "Gift")
	WebElement gift_card_cat;
	
	public void clickRegister() {
		registerLink.click();
	}
	
	public void clickLogin() {
		loginLink.click();
	}
	
	public void clickShopping() {
		shoppingLink.click();
	}
	
	public void clickWishlist() {
		wishlistLink.click();
	}
}
