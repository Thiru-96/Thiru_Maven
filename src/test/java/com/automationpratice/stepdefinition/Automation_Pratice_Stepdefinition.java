package com.automationpratice.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_class;
import com.automationpratice.runner.Automation_Pratice_Test_Runner;
import com.page_object_manager.POM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Automation_Pratice_Stepdefinition extends Base_class{
	
	public static WebDriver driver = Automation_Pratice_Test_Runner.driver;
	
	public static POM PP = new POM(driver);
	
	@Given("^user Launch The URL$")
	public void user_Launch_The_URL() throws Throwable {
		geturl("http://automationpractice.com/");
		max();
	}

	@Then("^user Click The SignIn Button$")
	public void user_Click_The_SignIn_Button() throws Throwable {
		clickonElement(PP.getInstanceHP().getSignIn());
	}

	@Given("^user Enter The Email Address In The Field$")
	public void user_Enter_The_Email_Address_In_The_Field() throws Throwable {
		inputvalueemail(PP.getInstanceLP().getEmailid(), "Thiru1996@gmail.com");
	}

	@And("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		inputvaluepass(PP.getInstanceLP().getPass(), "thirumurugan");
	}

	@Then("^user Click The SignIn Button And Navigate To Home Page$")
	public void user_Click_The_SignIn_Button_And_Navigate_To_Home_Page() throws Throwable {
		clickonElement(PP.getInstanceLP().getLogin());
	}

	@Given("^user Click The Women Dress Field$")
	public void user_Click_The_Women_Dress_Field() throws Throwable {
		clickonElement(PP.getInstanceRH().getWomen());
	}

	@Given("^user To Choose The Perfect Dress And Click Add To Cart$")
	public void user_To_Choose_The_Perfect_Dress_And_Click_Add_To_Cart() throws Throwable {
		implicitywait(30);
		clickonElement(PP.getInstanceAC().getAddcart());
	}

	@Then("^user Get Proceed The Cart And Navigate To Next Page$")
	public void user_Get_Proceed_The_Cart_And_Navigate_To_Next_Page() throws Throwable {
		implicitywait(30);
		clickonElement(PP.getInstanceSV().getProceed());
	}

	@Given("^user Verify The Product And Proceed To Check Out$")
	public void user_Verify_The_Product_And_Proceed_To_Check_Out() throws Throwable {
		clickonElement(PP.getInstanceSV().getCheckout());
	}

	@Given("^user Enter The Quantity Of Dress$")
	public void user_Enter_The_Quantity_Of_Dress() throws Throwable {
		implicitywait(30);
		clear(PP.getInstanceP().getQty());
		inputvalueemail(PP.getInstanceP().getQty(), "6");
	}

	@Then("^user Click The Proceed Button$")
	public void user_Click_The_Proceed_Button() throws Throwable {
		clickonElement(PP.getInstanceP().getProceed());
	}

	@Given("^user Verify The Address And Click Proceed To Check Out$")
	public void user_Verify_The_Address_And_Click_Proceed_To_Check_Out() throws Throwable {
		implicitywait(30);
		clickonElement(PP.getInstanceA().getAdd());
	}

	@Given("^user Click The Agree Button For Terms Of Service$")
	public void user_Click_The_Agree_Button_For_Terms_Of_Service() throws Throwable {
		implicitywait(30);
		clickonElement(PP.getInstanceS().getAgree());
	}

	@Then("^user Click The Proceed To Check Out Button$")
	public void user_Click_The_Proceed_To_Check_Out_Button() throws Throwable {
		clickonElement(PP.getInstanceS().getProcess());
	}

	@Given("^user Click The Payment Method To Use Pay Amount$")
	public void user_Click_The_Payment_Method_To_Use_Pay_Amount() throws Throwable {
		implicitywait(30);
		clickonElement(PP.getInstancePAY().getPay());
	}

	@Given("^user Click The Confirm Order Button$")
	public void user_Click_The_Confirm_Order_Button() throws Throwable {
		implicitywait(30);
		clickonElement(PP.getInstanceCO().getConfirm());
	}

	@Then("^user Click The SignOut Button$")
	public void user_Click_The_SignOut_Button() throws Throwable {
		clickonElement(PP.getInstanceCO().getSignOut());
	}

}
