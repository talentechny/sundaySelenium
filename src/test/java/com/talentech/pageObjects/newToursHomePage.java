package com.talentech.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newToursHomePage {
	
	WebDriver driver;
	
	public newToursHomePage(WebDriver driver){
		this.driver = driver;		
	}
	
	By link_Register = By.linkText("REGISTER");
	By edit_UserName = By.name("userName");
	By edit_Password = By.xpath("//input[@name='password']");
	
	public WebElement registerlink(){
		return driver.findElement(link_Register);
	}
	
	public WebElement userName(){
		return driver.findElement(edit_UserName);
	}
	
	public WebElement userPass(){
		return driver.findElement(edit_Password);
	}
	
	
	
	
	
	
	

}
