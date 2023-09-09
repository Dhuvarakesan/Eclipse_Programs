package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\Admin\\eclipse-workspace\\mobileautomate\\src\\test\\java\\Cyclos.feature",
glue={"stepdefenition"}	,
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=true
)
public class Runner {
	

}
