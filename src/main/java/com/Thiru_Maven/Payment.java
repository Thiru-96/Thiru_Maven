package com.Thiru_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='bankwire']")

	private WebElement pay;

	public Payment(WebDriver dri4) {
		this.driver = dri4;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPay() {
		return pay;
	}

}
