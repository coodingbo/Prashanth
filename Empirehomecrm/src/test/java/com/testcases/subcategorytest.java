package com.testcases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.subcategoryfunctionality;

public class subcategorytest extends  Basetest {
	
	Loginfunctionality lf;
	subcategoryfunctionality sf;
	public subcategorytest() {
		super();
		
	}
	@BeforeTest
	public void set() {
		
		initialization();
		lf=new Loginfunctionality();
		lf.verifylogin();
		sf= new subcategoryfunctionality();
		
	}
	
	@Test (priority= 1)
	public void addsubcategoryvalidation() throws Throwable{
	sf.verifyaddnewcategory();
	
	List<WebElement>records=driver.findElements(By.tagName("sr"));
	int recordcount=records.size();
	
	AssertJUnit.assertEquals(recordcount, 2);
	}
	
	@Test (priority= 2)
	
	
	public void editsubcategoryvalidation() throws Throwable{
		sf.verifyaddnewcategory();
		
		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Subcategories?catId=527");
	}
		
	@Test (priority= 3)
	public void deletesubcategoryvalidation() throws Throwable{
		sf.verifyaddnewcategory();
		
		List<WebElement>records=driver.findElements(By.tagName("sr"));
		int recordcount=records.size();
		
		AssertJUnit.assertEquals(recordcount, 1);
		}
		
	

}

