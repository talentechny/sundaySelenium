package com.talentech.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageObjectsPF {
	
	WebDriver driver;
	
	public RegistrationPageObjectsPF(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}//end of constructor
	
	@FindBy(name="email")
	WebElement userName;
	
	public WebElement userName(){
		return userName;
	}
	
	@FindBy(name="password")
	WebElement userPass;
	
	public WebElement userPass(){
		return userPass;
	}
	

}
