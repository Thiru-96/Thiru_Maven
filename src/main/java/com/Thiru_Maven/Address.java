package com.Thiru_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public WebDriver driver;
	
	@FindBy(name = "processAddress")
	
	private WebElement add;
	

	public Address(WebDriver dri1) {
		this.driver = dri1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		
		return add;
		
	}

}
