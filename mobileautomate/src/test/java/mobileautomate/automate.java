package mobileautomate;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class automate {
public  static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
          DesiredCapabilities cap=new DesiredCapabilities();
          cap.setCapability("platformName", "Android");
          cap.setCapability("platformVersion", "11");
          cap.setCapability("deviceName", "Redmi Note 11");
          cap.setCapability("udid", "caa9d2b4");
          cap.setCapability("appPackage", "org.cyclos.mobile");
          cap.setCapability("appActivity", "org.cyclos.mobile.MainActivity");
          
          URL url=new URL("http://0.0.0.0:4723/wd/hub");
          driver =new AndroidDriver(url,cap);
          
          WebElement link = driver.findElement(By.className("android.widget.EditText"));
          link.sendKeys("https://demo.cyclos.org");
          WebElement submiturl = driver.findElement(By.xpath("//*[@text='Submit']"));
          submiturl.click();
          Thread.sleep(8000);
          WebElement username = driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[1]"));
          username.sendKeys("demo");
          WebElement password = driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[2]"));
          password.sendKeys("1234");
          WebElement loginbutton = driver.findElement(By.className("android.widget.Button"));
          loginbutton.click();
          
          Thread.sleep(4000);
          WebElement cancel = driver.findElement(By.xpath("//*[@text='CANCEL']"));
          cancel.click();
          Thread.sleep(4000);
          WebElement notnow1 = driver.findElement(By.xpath("//*[@text='Not now']"));
          notnow1.click();
          Thread.sleep(5000);
          WebElement notnow2 = driver.findElement(By.xpath("//*[@text='Not now']"));
          notnow2.click();
          Thread.sleep(5000);
          WebElement payment = driver.findElement(By.xpath("//*[@text='APayment']"));
          payment.click();
          Thread.sleep(4000);
          WebElement paymettosystem = driver.findElement(By.xpath("//*[@text='w To System account Make payment to System account']"));
          paymettosystem.click();
          Thread.sleep(4000);
          WebElement amount = driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[1]"));
          amount.sendKeys("1111");
          Thread.sleep(5000);
          
          WebElement  makepayment = driver.findElement(By.xpath("(//*[@class='android.widget.Button'])[1]"));
          makepayment.click();
          Thread.sleep(4000);
          WebElement cnfrm = driver.findElement(By.xpath("//*[@text='Confirm']"));
          cnfrm.click();
          
	}

}
