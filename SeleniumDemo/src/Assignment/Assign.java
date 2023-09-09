/**
 * 
 */
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Dhuvarakesan Mani
 * 28-6-2023
 */
public class Assign {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//setSize(new Dimension (700,1000))
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.Cyclos.org");
		driver.findElement(By.xpath("//a[contains(text(),'Product')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Visit')]")).click();
		Set <String> set=driver.getWindowHandles();
		for(String window:set)
			driver.switchTo().window(window);
		driver.findElement(By.cssSelector("a[id='login-link']")).click();
		WebElement login=driver.findElement(By.cssSelector("input[autocomplete='username']"));
		WebElement pass=driver.findElement(By.cssSelector("input[autocomplete='password']"));
		Actions action =new Actions(driver);
		action.moveToElement(login).click().sendKeys("demo").build().perform();
		action.moveToElement(pass).click().sendKeys("1234").build().perform();
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		//driver.findElement(By.cssSelector("a[id='sidenav-trigger']")).click();
		Set <String> s=driver.getWindowHandles();
		for(String window:s)
			driver.switchTo().window(window);
		WebElement member=driver.findElement(By.xpath("a[class='menu-item d-flex align-items-center'][tabindex='0'][href='/ui/banking/self/account/memberaccount']"));
		action.moveToElement(member).click().perform();
		
	}

}
