/**
 * 
 */
package com.regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * program to check whether the given phone number is valid or not
 * @author dhuvarakesan
 * 4-6-2023
 */
public class CheckingMobileNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("INPUT :");
		String number=in.next();
		Pattern pObj = Pattern.compile("^(91|\\+91|0)?[6-9]\\d{9}$");// regular expression link:https://regex101.com/r/mJYtbT/2 which is created by dhuvarakesan
		Matcher mObj = pObj.matcher(number);
		if(mObj.find())
			System.out.println("ValidNumber : "+number);
		else
			System.out.println("Invalid Number : "+number);

	}

}
