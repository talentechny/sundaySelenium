package com.talentech.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.talentech.pageObjects.RegistrationPageObjectsPF;
import com.talentech.pageObjects.newToursHomePage;
import com.talentech.pageObjects.newToursHomePagePF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPage {
	
	private WebDriver driver;
	
	@Given("^user visit newtours homepage$")
	public void user_visit_newtours_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^user click on register link$")
	public void user_click_on_register_link() throws Throwable {
		
		//driver.findElement(By.linkText("REGISTER")).click();
//		newToursHomePagePF nth = new newToursHomePagePF(driver);
//		nth.registerLink().click();
		
		newToursHomePage nthp = new newToursHomePage(driver);
		nthp.registerlink().click();
		

	}

	@When("^user enter username, password, confirm password, and click submit$")
	public void user_enter_username_password_confirm_password_and_click_submit() throws Throwable {
		
		//driver.findElement(By.name("email")).sendKeys("mahbub");
		RegistrationPageObjectsPF rp = new RegistrationPageObjectsPF(driver);
		rp.userName().sendKeys("mahbub");
		//driver.findElement(By.name("password")).sendKeys("Password");
		rp.userPass().sendKeys("Password");

	}

	@Then("^user receives a confirmation$")
	public void user_receives_a_confirmation() throws Throwable {

	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {

	}

}
