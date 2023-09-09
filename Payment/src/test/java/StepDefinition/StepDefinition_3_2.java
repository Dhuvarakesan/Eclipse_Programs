package StepDefinition;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Given;

public class StepDefinition_3_2 extends HelperClass {

	@Given("user should click the Payment to system")
	public void user_should_click_the_payment_to_system() {
		HelperClass.precondition();
		HelperClass.login();
		Repository_3.banking.click();
		Repository_3.payment_To_System.click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");
	}
}
