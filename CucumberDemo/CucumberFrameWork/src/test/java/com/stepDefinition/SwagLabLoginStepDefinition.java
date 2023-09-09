package com.stepDefinition;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabLoginStepDefinition {
	public static WebDriver driver;
	@Given("Open chromebrowser and launch SwaglabLogin")
	public void open_chromebrowser_and_launch_SwaglabLogin() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/v1/");
	    PageFactory.initElements(driver,SwagLabLoginRep.class);
	}
	String [] user= {"standard_user","locked_out_user"};
	@DataProvider(name="u")
	String [] usercredentials(){
		return user;
	}
	String [] pass= {"secret_sauce","secret"};
	@DataProvider(name="p")
	String [] passcredentials(){
		return pass;
	}
	
	@Given("User Should locate the username text field and click")
	public void user_Should_locate_the_username_text_field_and_click() {
		SwagLabLoginFun.clickUser();
	}
	@org.testng.annotations.Test(dataProvider = "u")
	@Given("User should type username keyword")
	public void user_should_type_username_keyword(String user) {
		SwagLabLoginFun.passUsername(user);
	}

	@Given("User Should locate the password text field and click")
	public void user_Should_locate_the_password_text_field_and_click() {
		SwagLabLoginFun.clickPass();
	}
	@org.testng.annotations.Test(dataProvider = "p")
	@Given("User should type password keyword")
	public void user_should_type_password_keyword(String pass) {
		SwagLabLoginFun.passPassword(pass);
	}

	@Then("user should click the login button")
	public void user_should_click_the_login_button() {
		SwagLabLoginFun.cilckLogin();
	}
	


}
