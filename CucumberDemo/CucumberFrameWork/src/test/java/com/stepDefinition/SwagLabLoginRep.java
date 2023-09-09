package com.stepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabLoginRep {
	@FindBy(id = "user-name")
	public static WebElement user;
	@FindBy(id = "password")
	public static WebElement pass;
	@FindBy(id = "login-button")
	public static WebElement login_Bt;

}
