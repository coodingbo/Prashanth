package com.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.categoriesFunctionality;

public class categorytest extends Basetest {
	
	Loginfunctionality lf;
	categoriesFunctionality ctf;
	
	public categorytest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
		ctf = new categoriesFunctionality();
	}
	
	
	@Test (priority = 1)
	public void addnewcategoryvalidation() throws Throwable {
		ctf.common();
		ctf.verifyaddnewcategory();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 8);
		
	}
	
	@Test (priority = 2)
	public void editcategoryvalidation() throws Throwable {
		//ctf.common();
		ctf.verifyeditcategory();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Categories");
	}
	
	@Test (priority = 3)
	public void deletecategoryvalidation() throws Throwable {
		
		ctf.verifydeletecategory();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 7);
	}

	@AfterTest
	public void teardown() {
		
	}
	

}
