package com.testcases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Holidayfunctionality;
import com.pageobjects.Loginpage;

public class Holidaytestecases extends Basetest {
	Loginpage login;
	Holidayfunctionality holidays;
	 
	
	public Holidaytestecases() {
		super();
	}	
	@BeforeMethod
	public void setup() {
		initialization();
		
		login = new Loginpage();
		holidays = new Holidayfunctionality();
	}
	@Test	
	public void Holidaysvalidation() {
		login.Loginverification();
		
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirename,myprojectonline.co.in/master/Holidays");
	}
		
	@AfterMethod
	public void teardown() {
		
	}
	

}
 