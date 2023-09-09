package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\Admin\\eclipse-workspace\\AssignmentDemo\\src\\test\\resources\\Feature\\Login.feature",
glue={"stepdefinition"},
dryRun=false,
monochrome=true,
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}					
)
public class RunnerClass {
	
}
