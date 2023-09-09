package stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import helper.Find;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	WebDriver driver;
	List<String> list;
	Find f;
	@Before
	public void intilize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Given("user is entering {string}")
	public void user_is_entering(String string) {
		driver.get(string);
	}
	
	@When("User enters the given credentials below")
	public void user_enters_the_given_credentials_below(io.cucumber.datatable.DataTable dataTable) throws IOException {
	   list = dataTable.asList();
	   f=new Find("Locators.properties");
	   driver.findElement(f.element("uname")).sendKeys(list.get(0));
	   driver.findElement(f.element("pass")).sendKeys(list.get(1));
	   
	}
	@When("the user clicks  And gets login")
	public void the_user_clicks_and_gets_login() {
		driver.findElement(f.element("login_Bt")).click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");
		
	}
	
	@Then("close the browser window")
	public void close_the_browser_window() throws InterruptedException {
		System.out.println("It will With In 2_Seconds");
	}
	@After
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
