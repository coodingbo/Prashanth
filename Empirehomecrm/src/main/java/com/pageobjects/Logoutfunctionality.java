package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Logoutfunctionality extends Basetest {
	
	@FindBy (xpath = "//img[@alt='user']")
	WebElement profile;
	
	@FindBy (xpath = "//a[normalize-space()='Signout']")
	WebElement signout;
	
	public Logoutfunctionality() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifylogout() throws Throwable {
		
		Thread.sleep(2000);
		profile.click();
		Thread.sleep(2000);
		signout.click();
	}

} 


