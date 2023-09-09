package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repository {
@FindBy(className="android.widget.EditText")
public static WebElement urlSend;

@FindBy(xpath="//*[@text='Submit']")
public static WebElement urlSubmit ;

@FindBy(xpath="(//*[@class='android.widget.EditText'])[1]")
public static WebElement username ;

@FindBy(xpath="(//*[@class='android.widget.EditText'])[2]")
public static WebElement password;

@FindBy(className="android.widget.Button")
public static WebElement loginButton;

@FindBy(xpath="//*[@text='CANCEL']")
public static WebElement fingerprintCancel;

@FindBy(xpath="//*[@text='Not now']")
public static WebElement notNow1;

@FindBy(xpath="//*[@text='Not now']")
public static WebElement  notNow2;

@FindBy(xpath="//*[@text='APayment']")
public static WebElement paymentMenu;

@FindBy(xpath="//*[@text='w To System account Make payment to System account']")
public static WebElement paymentTosystem ;

@FindBy(xpath="(//*[@class='android.widget.EditText'])[1]")
public static WebElement amount;

@FindBy(xpath="(//*[@class='android.widget.Button'])[1]")
public static WebElement makePayment ;

@FindBy(xpath="//*[@text='Confirm']")
public static WebElement confirmButton;

}
