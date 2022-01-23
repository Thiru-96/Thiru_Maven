package com.Thiru_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Shipping {
	public WebDriver driver;

	@FindBy(id = "cgv")

	private WebElement agree;
	
	@FindBy(name = "processCarrier")
	
	private WebElement Process;

	public WebElement getProcess() {
		return Process;
	}

	public Shipping(WebDriver dri3) {
		this.driver = dri3;

		PageFactory.initElements(driver, this);
	}

	public WebElement getAgree() {
		return agree;
	}

}
