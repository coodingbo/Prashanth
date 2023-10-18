package com.testcases;

import java.beans.Customizer;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Customerfunctionality;
import com.pageobjects.Loginfunctionality;

public class customertestcases<Login_page02> extends Basetest {

	Loginfunctionality Login;
	Customerfunctionality Customer;

	public customertestcases() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		Login = new Loginfunctionality();
		Customer = new Customerfunctionality();
	}

	@Test

	public void Customervalidation() throws Throwable {
		Login.verifylogin();
		Customizer. customervalidation();

		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/User/CustomerList");

	}

	@AfterMethod
	public void teardown() {

	}
}

 


