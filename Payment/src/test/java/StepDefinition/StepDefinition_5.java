package StepDefinition;

import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition_5 {
	@Given("user should click the market")
	public void user_should_click_the_market() throws IOException {
		HelperClass.getDataFromExcel();
		HelperClass.precondition();
		HelperClass.login();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");
		Repository_3.Marketplace.click();

	}

	@Given("User Should Click Advertisements")
	public void user_should_click_advertisements() {
		Repository_3.Advertisements.click();
	}

	@Then("User Should Click Show Advertisements")
	public void user_should_click_show_advertisements() {
		Repository_3.show_Advertisements.click();
	}

	@Then("click Food")
	public void click_food() {
		Repository_3.food.click();
	}

	@Then("User Should click Ask")
	public void user_should_click_ask() {
		Repository_3.ask.click();
	}

	@Then("User Should Pass Value")
	public void user_should_pass_value() throws InterruptedException {
		Thread.sleep(2000);
		//ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");
		Repository_3.text_Value.sendKeys("hello");
		Repository_3.submit_Bt_ask.click();
	}
}
