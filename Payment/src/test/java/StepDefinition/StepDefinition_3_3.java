package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition_3_3 extends HelperClass {
	@Given("user should click the Payment Requests")
	public void user_should_click_the_payment_requests() throws IOException, InterruptedException {
		HelperClass.getDataFromExcel();
		HelperClass.precondition();
		HelperClass.login();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");
		Repository_3.banking.click();
		Repository_3.payment_Requests.click();

	}

	@Given("User Should Click Send New Request")
	public void user_should_click_send_new_request() {
		Repository_3.send_A_New_Request.click();
	}

	@Then("User Should Select Receiver")
	public void user_should_select_receiver() {
		Repository_3.contact_List.click();
		Repository_3.car_Repair.click();
	}

	@Then("User Should Enter The  Amount")
	public void user_should_enter_the_amount() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Repository_3.amount_Request));
		Repository_3.amount_Request.click();
		Repository_3.amount_Request.sendKeys("10");
	}

	@Then("User Should Enter The Expiration Date")
	public void user_should_enter_the_expiration_date() throws InterruptedException {
		Repository_3.expiration_Date.click();
		Repository_3.expiration_Date.sendKeys("12");
		Repository_3.expiration_Date.sendKeys("12");
		Repository_3.expiration_Date.sendKeys("2028");
	}

	@Then("User Should click Confirm")
	public void user_should_click_confirm() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Repository_3.confirm_Request));
		Repository_3.confirm_Request.click();
		wait.until(ExpectedConditions.elementToBeClickable(Repository_3.confirm_Request_1));
		Repository_3.confirm_Request_1.click();
		boolean flag = wait.until(ExpectedConditions.textToBePresentInElement(Repository_3.verify_Request_Payment,
				Repository_3.verify_Request_Payment.getText()));
		Assert.assertTrue(flag);
	}

}
