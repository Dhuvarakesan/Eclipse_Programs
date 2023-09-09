package StepDefinition;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HelperClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String userName;
	public static String password;
	public static JavascriptExecutor js;

	public static void precondition() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, Repository_3.class);

	}

	public static void login() {
		driver.get("https://demo.cyclos.org/ui/login");
		System.out.println("user:" + userName);
		System.out.println("pass:" + password);
		wait.until(ExpectedConditions.visibilityOf(Repository_3.username));
		Repository_3.username.sendKeys(userName);
		Repository_3.username.sendKeys(Keys.ENTER);
		Repository_3.password.sendKeys(password);
		Repository_3.submit_Bt.click();

	}

	public static void selectFromList(List<WebElement> list, String text) {
		for (WebElement i : list) {
			if (i.getText().equals(text)) {
				i.click();
				break;
			}
		}
	}

	@Test
	public static void disp() {
		System.out.println("Testing TestNG  In Cucumber");
	}
	public static void scrollToBottom() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public static void getDataFromExcel() throws IOException {
		FileInputStream excleObj = new FileInputStream(
				"C:\\Users\\Admin\\eclipse-workspace\\Payment\\Excel\\LoginCredentials (3).xlsx");
		XSSFWorkbook bookObj = new XSSFWorkbook(excleObj);
		XSSFSheet sheetObj = bookObj.getSheetAt(0); 
		userName = sheetObj.getRow(1).getCell(0) + "";
		password = sheetObj.getRow(1).getCell(1) + "";
		password = password.substring(0, password.indexOf('.'));

	}

	public static String userName() {
		System.out.println("in:" + userName);
		return userName;
	}

	public static String password() {
		System.out.println("in:" + password);
		return password;
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
