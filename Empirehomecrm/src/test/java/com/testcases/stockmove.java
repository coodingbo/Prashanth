package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;
import com.pageobjects.Loginpage;

public class stockmove<StockmoveFunctionality> extends Basetest {

	Loginpage LP ;
	StockmoveFunctionality SMF;
	
	public void Stock_moving () {
		super();
	}
		
@BeforeMethod
public void Data() {
	initialization();
	LP = new Loginpage();
	SMF = new StockmoveFunctionality();
}
@Test
public void Data1() throws Throwable {
	((Object) LP).Loginverification();
	((Object) SMF).verifyStockmove();
	String urltest = driver.getCurrentUrl();
	Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/StockMovement");

}

@AfterMethod
public void teardown() {

}
}
	
	
	
	
	
	

