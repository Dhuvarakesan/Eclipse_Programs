package com.training;

import java.util.Scanner;
/**
 * program for checking palindrom
 * @author dhuvarakesan
 * 5-5-2023
 */
public class Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Input:");
		String input=in.next();
		StringBuffer str=new StringBuffer(input);
		if(input.equals(new String(str.reverse())))
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");
		in.close();
	}

}
