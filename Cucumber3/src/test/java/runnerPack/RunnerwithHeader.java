package runnerPack;

import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class RunnerwithHeader {
	
	@io.cucumber.testng.CucumberOptions(features="features/WithHeader.feature",glue="dataTables")

	public class TestRunner extends AbstractTestNGCucumberTests{
	}

}
