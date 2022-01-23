package com.Thiru_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StockVerify {
	
	public WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
	
	private WebElement proceed;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	
	private WebElement checkout;

	public WebElement getCheckout() {
		
		return checkout;
	}


	public StockVerify(WebDriver driver6) {
		this.driver = driver6;
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getProceed() {
		return proceed;
	}
	
	

}
