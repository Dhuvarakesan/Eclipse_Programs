package runnerPack;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;



	@io.cucumber.testng.CucumberOptions(features="features/WithExample.feature",
	glue={"Examples"},
	monochrome=true,
	tags="@Positive"
			)

	public class RunnerwithExample extends AbstractTestNGCucumberTests {


}
