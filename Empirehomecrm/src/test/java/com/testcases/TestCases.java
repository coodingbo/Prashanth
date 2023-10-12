package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;
import com.utils.Datasource;

public class TestCases extends Basetest {
	
	TestCases If;
	private final String sheet = "sheet1";
	public TestCases() {
		super();
	}
	public TestCases(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	@DataProvider
	public String[][] dataload() throws Throwable{
		return Datasource.Customerdata(sheet);
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		If = new TestCases(driver);
		
	}
	@Test(dataProvider = "dataload",dataProviderClass = TestCases.class)
	
	public void verifylogin(String username, String password) {
		// TODO Auto-generated method stub
		If.verifylogin(username,password);
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
	}
	
	



}

	
	
	
	
	
	


