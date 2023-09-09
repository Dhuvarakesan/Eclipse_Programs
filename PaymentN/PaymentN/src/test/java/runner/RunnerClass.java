package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\Admin\\eclipse-workspace\\PaymentN\\PaymentN\\src\\test\\resources\\Features\\3_Features\\3.1Payment_Requests.feature",
glue={"stepdefinition"}	,
tags="@Test1"
)
public class RunnerClass {

}
