package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;
import com.pageobjects.Customerfunctionality;
import com.pageobjects.Loginfunctionality;

public class LogoutTest extends Basetest {
	
	
		
		Loginfunctionality lf;
		Loginfunctionality logout;
		
		public LogoutTest() {
			
			super();
			
		}
		
		@BeforeMethod
		public void setup() {
			
			initialization();
			
			lf = new Loginfunctionality();
			lf.verifylogin();
			
			logout =new Loginfunctionality();
			}
		
		@Test
		public void logoutvalidation() throws Throwable {
			
			
             logout.verifylogout();
			
			String urltest = driver.getCurrentUrl();
			Assert.notEmpty(urltest, "http://empirehome.myprojectsonline.co.in/");
		}
		
		@AfterMethod
		public void teardown() {
			
		}

	}
	
	


