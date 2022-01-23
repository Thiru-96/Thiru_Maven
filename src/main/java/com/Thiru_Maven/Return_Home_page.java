package com.Thiru_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Return_Home_page {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//a[@title='Women']")
	
	private WebElement Women;
	
	public Return_Home_page(WebDriver driver3) {
		
		this.driver=driver3;
		
		PageFactory.initElements(driver, this);
	}

	
	
	public WebElement getWomen() {
		
		return Women;
	}



	
	

}
