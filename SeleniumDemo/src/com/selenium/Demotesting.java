package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;//setSize(new Dimension (700,1000))
		driver.get("https://www.leafground.com/dashboard.xhtml");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a"));
		element.click();
	}

}
