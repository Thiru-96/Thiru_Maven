package com.Thiru_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order {
	public WebDriver driver;

	@FindBy(xpath = "(//button[@type='submit'])[2]")

	private WebElement confirm;
	
	@FindBy(xpath = "//a[@title='Log me out']")
	
	private WebElement SignOut;

	public Confirm_Order(WebDriver dri5) {
		this.driver = dri5;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	public WebElement getSignOut() {
		return SignOut;
	}

}
