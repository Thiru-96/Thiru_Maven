package com.Thiru_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTo_Cart {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='product-name']")
	
	private WebElement addcart;

	public AddTo_Cart(WebDriver driver4) {
		
		this.driver = driver4;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddcart() {
		
		return addcart;
	}
	
	
	
	

}
