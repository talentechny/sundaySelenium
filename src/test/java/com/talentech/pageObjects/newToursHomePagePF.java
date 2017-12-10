package com.talentech.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newToursHomePagePF {
	
	WebDriver driver;
	
	public newToursHomePagePF(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}//end of constructor
	
	@FindBy(linkText="REGISTER")
	WebElement link_Register;
	
	public WebElement registerLink(){
		return link_Register;
	}

}
