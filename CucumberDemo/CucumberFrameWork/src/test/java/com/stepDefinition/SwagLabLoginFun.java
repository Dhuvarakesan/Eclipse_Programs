package com.stepDefinition;

public class SwagLabLoginFun {
	public static void clickUser() {
		SwagLabLoginRep.user.click();
	}
	public static void passUsername(String user) {
		SwagLabLoginRep.user.sendKeys(user);
	}
	public static void clickPass() {
		SwagLabLoginRep.pass.click();
	}
	public static void passPassword(String pass) {
		SwagLabLoginRep.pass.sendKeys(pass);
	}
	public static void cilckLogin() {
		SwagLabLoginRep.login_Bt.click();
	}

}
