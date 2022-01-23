package com.Thiru_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	
	private WebElement proceed;
	
	@FindBy(name = "quantity_7_34_0_614885")
	
	private WebElement qty;
	

	public WebElement getQty() {
		return qty;
	}

	public Proceed(WebDriver dri) {
		this.driver = dri;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	

}
