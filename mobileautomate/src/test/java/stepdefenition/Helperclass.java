package stepdefenition;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import repository.Repository;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Helperclass {
	public static AndroidDriver driver;
	public static String userName;
	public static String password;
	public static WebDriverWait wait;
	public static void precondition() throws MalformedURLException {
		 UiAutomator2Options options =new UiAutomator2Options();
		 options.setDeviceName("Redmi Note 11");
		 options.setPlatformVersion("11");
		 options.setUdid("caa9d2b4");
		 options.setAppPackage("org.cyclos.mobile");
		 options.setAppActivity("org.cyclos.mobile.MainActivity");
         URL url=new URL("http://0.0.0.0:4723");
         driver =new AndroidDriver(url,options);
         
		}
	public static void urlsend() {
	 PageFactory.initElements(driver,Repository.class);
	    Repository.urlSend.sendKeys("https://demo.cyclos.org");
	    Repository.urlSubmit.click();
	}
	
	public static void login() {
		   Repository.username.sendKeys("demo");
		   Repository.password.sendKeys("1234");
		   Repository.loginButton.click();
		
	}
	public static  void fingerprintcancel() {
		   Repository.fingerprintCancel.click();
	}
	public static void notnow() {
		   Repository.notNow1.click();
		   Repository.notNow2.click(); 
	}
	public static void paymentmenu() {
		   Repository.paymentMenu.click();
		   Repository.paymentTosystem.click();
	}
	public static void makeapayment() {
		   Repository.amount.sendKeys("111");
		   Repository.makePayment.click();
		   Repository.confirmButton.click();
	}
	}
