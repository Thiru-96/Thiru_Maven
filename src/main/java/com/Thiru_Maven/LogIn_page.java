package com.Thiru_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_page {
	
	public WebDriver driver;
	
	@FindBy(name = "email")
	
	private WebElement emailid;
	
	@FindBy(id = "passwd")
	
	private WebElement pass;
	
	@FindBy(xpath = "//i[@class='icon-lock left']")
	
	private WebElement Login;

	public LogIn_page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return Login;
	}
	
	
}
