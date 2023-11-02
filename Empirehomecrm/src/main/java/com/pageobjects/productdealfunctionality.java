package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class productdealfunctionality extends Basetest {
	
	
	 @FindBy(xpath = "//strong[normalize-space()='Select Customer']")
     WebElement selectcustomer;
     @FindBy(xpath = "//a[@class='btn common-btn mt-3']")
     WebElement register;
     @FindBy(xpath = "//input[@placeholder='Full Name']")
     WebElement fullname;
     @FindBy(xpath = "//input[@placeholder='Mobile Number']")
     WebElement mobilenumber;
     @FindBy(xpath = "//input[@placeholder='Email']")
     WebElement Email;
     @FindBy(xpath = "//input[@placeholder='Whatsapp Number']")
     WebElement whatsappnumber;
     @FindBy(xpath = "//button[normalize-space()='Save']")
     WebElement savebutton;
     @FindBy(xpath = "//input[@placeholder='Search Name or Number or Mail']")
     WebElement searchbox;
     @FindBy(xpath = "class=\"col-md-12 table-bordered table-striped table-condensed cf\"")
     WebElement select;
     
      @FindBy(xpath = "//b[normalize-space()='Inventory']")
      WebElement inventory;
      
     
     public productdealfunctionality() {
  	   PageFactory.initElements(driver, this);
     }
  	   public void End() {
  		   
  		   selectcustomer.click();
  		   register.click();
  		   fullname.sendKeys(prop.getProperty("fullname"));
  		   mobilenumber.sendKeys("mobilenumber");
  		   Email.sendKeys("MAIL");
  		   whatsappnumber.sendKeys("wathsappno");
  		   savebutton.click();
  		   searchbox.sendKeys(prop.getProperty("searcbox"));
  		   
  		   
  		   
  		   
  		   
  		   
	}
  	  
  
  	   
     }


