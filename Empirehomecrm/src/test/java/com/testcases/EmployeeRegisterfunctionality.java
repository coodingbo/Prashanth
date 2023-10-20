package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;
import com.pageobjects.Loginfunctionality;

public class EmployeeRegisterfunctionality extends Basetest  {
	
Loginfunctionality login;
EmployeeRegisterfunctionality employee;


public EmployeeRegisterfunctionality() {
	super();
	
}
@BeforeMethod
public void setup() {
	initialization();
	
	login=new Loginfunctionality();
	login.verifylogin();
	
	
	employee=new EmployeeRegisterfunctionality();
	
}
@Test

 public void EmployeeRegisterfunctionalityvalidation() throws Throwable {
	
	login.verifylogin();
	 String urltest=driver.getCurrentUrl();
	 Assert.notEmpty(urltest, "http://empirehome.myprojectsonline.co.in/Master/Register");
	 
	
	
	
	
	
	
}
}

