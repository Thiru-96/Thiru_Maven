package com.automationpratice.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//automationpratice//feature", glue = "com.automationpratice.stepdefinition")
public class Automation_Pratice_Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void startup() {
		
		driver = Base_class.getbrowser("chrome");

	}
	
	@AfterClass
	public static void endwith() {
		
		driver.close();

	}

}
