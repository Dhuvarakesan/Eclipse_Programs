package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGooglePageStepDefinition {
	WebDriver driver;
	@Given("Open the chrome browser and lanch goole application")
	public void open_the_chrome_browser_and_lanch_goole_application() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.google.co.in");
		//System.out.println("m1");
	}

	@When("User Should locate the search text field and click")
	public void user_should_locate_the_search_text_field_and_click() {
		driver.findElement(By.name("q")).click();
		//System.out.println("m2");
	}

	@When("User should type search keyword")
	public void user_should_type_search_keyword() {
		driver.findElement(By.name("q")).sendKeys("seleniun");
	}

	@When("User should click the search button")
	public void user_should_click_the_search_button() {
		driver.findElement(By.name("btnK")).click();
	}

	@Then("User should get the search results")
	public void user_should_get_the_search_results() {
		boolean result = driver.findElement(By.partialLinkText("dhuvarakesan")).isDisplayed();
		if(result)
			System.out.println("Search Result Came");
		else
			System.out.println("Not Came");
	}




}
