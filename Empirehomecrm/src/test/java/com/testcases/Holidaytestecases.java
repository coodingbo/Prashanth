package com.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageobjects.Holidayfunctionality;
import com.pageobjects.Loginpage;

public class Holidaytestecases Basetest {
	Loginpage login;
	HolidayFunctionality holidays;
	 
	
	public HolidayFunctionality() {
		super();
	}	
	@BeforeMethod
	public void setup(Holidayfunctionality holidays, Loginpage login) {
		initialization();
		
		login = new Loginpage();
		holidays = new Holidayfunctionality();
	}
	@Test	
	public void Holidaysvalidation(Holidaytestecasesextends holidays, Object driver) {
		login.Loginverification();
		holidays.Holidaysvalidation(holidays);
		
		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirename,myprojectonline.co.in/master/Holidays");
	}
		
	@AfterMethod
	public void teardown() {
		
	}
	

}
 


