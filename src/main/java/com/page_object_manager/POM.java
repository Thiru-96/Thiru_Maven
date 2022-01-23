package com.page_object_manager;

import org.openqa.selenium.WebDriver;

import com.Thiru_Maven.AddTo_Cart;
import com.Thiru_Maven.Address;
import com.Thiru_Maven.Confirm_Order;
import com.Thiru_Maven.Home_page;
import com.Thiru_Maven.LogIn_page;
import com.Thiru_Maven.Payment;
import com.Thiru_Maven.Proceed;
import com.Thiru_Maven.Return_Home_page;
import com.Thiru_Maven.Shipping;
import com.Thiru_Maven.StockVerify;

public class POM {

	public WebDriver driver;

	private Home_page HP;

	private LogIn_page LP;

	private Return_Home_page RH;

	private AddTo_Cart AC;

	private StockVerify SV;

	private Proceed P;

	private Address A;

	private Shipping S;

	private Payment PAY;

	private Confirm_Order CO;

	public POM(WebDriver driverPOM) {

		this.driver = driverPOM;

	}

	public Home_page getInstanceHP() {

		HP = new Home_page(driver);

		return HP;
	}

	public LogIn_page getInstanceLP() {

		LP = new LogIn_page(driver);

		return LP;
	}

	public Return_Home_page getInstanceRH() {

		RH = new Return_Home_page(driver);

		return RH;
	}

	public AddTo_Cart getInstanceAC() {

		AC = new AddTo_Cart(driver);

		return AC;
	}

	public StockVerify getInstanceSV() {

		SV = new StockVerify(driver);

		return SV;
	}

	public Proceed getInstanceP() {

		P = new Proceed(driver);

		return P;
	}

	public Address getInstanceA() {

		A = new Address(driver);

		return A;
	}

	public Shipping getInstanceS() {

		S = new Shipping(driver);

		return S;
	}

	public Payment getInstancePAY() {

		PAY = new Payment(driver);

		return PAY;
	}

	public Confirm_Order getInstanceCO() {

		CO = new Confirm_Order(driver);

		return CO;
	}

}
