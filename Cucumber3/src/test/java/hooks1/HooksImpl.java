package hooks1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksImpl {
	public static WebDriver driver;
	
	@Before("@Positive")
	public void disp()
	{
		System.out.println("Positive test cases");
	}
	@Before("@Negative")
	public void disp1()
	{
		System.out.println("Negative Testcases");
	}
	
}
