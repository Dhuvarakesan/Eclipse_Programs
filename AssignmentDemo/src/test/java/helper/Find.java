package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class Find {
	Properties p;
	public Find(String file) throws IOException{
		FileInputStream fileObj = new FileInputStream(file);
		p=new Properties();
		p.load(fileObj);
	System.out.println(p.getProperty("uname")+"hello");
	}
	public By element(String ele) {
		String [] seperate = p.getProperty(ele).split(":");
		String locater = seperate[0];
		String locaterValue = seperate[1];
		switch(locater.toUpperCase()){
			case "ID":
				return By.id(locaterValue);
			case "Name":
				return By.name(locaterValue);
			case "XPATH":
				return By.xpath(locaterValue);
			default:
				return null;
		}
	}

}

