package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\swarn\\workspace4\\Cucumber3\\src\\test\\resources\\features\\LoginDataTable.feature",
glue={"dataTables"},
dryRun=false,
monochrome=true,
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}					
)
	

	public class RunnerClass1 {
		
}
