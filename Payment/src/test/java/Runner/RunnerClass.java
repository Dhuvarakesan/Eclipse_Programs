package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features={"C:\\Users\\Admin\\eclipse-workspace\\Payment\\src\\test\\resources\\Features\\3.1User_to_User_Payment.feature",
		"C:\\Users\\Admin\\eclipse-workspace\\Payment\\src\\test\\resources\\Features\\3.2Payment_To_System.feature",
		"C:\\Users\\Admin\\eclipse-workspace\\Payment\\src\\test\\resources\\Features\\3.3Payment_Requests.feature",
		"C:\\Users\\Admin\\eclipse-workspace\\Payment\\src\\test\\resources\\Features\\Feature_5.feature"},
glue={"StepDefinition"}	,
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags="@Test1"
)
public class RunnerClass  extends AbstractTestNGCucumberTests{

}
