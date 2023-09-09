/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * Write a program to get a number n from user and display the last digit of n
 * @author dhuvarakesan
 * 27-04-2023
 */
public class DisplayLastNumber {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);//creating object for Scanner class
		System.out.println("Enter th Value:");
		int input=in.nextInt();//getting input from user
		System.out.println("Last Digit:"+input%10);
		in.close();
	}

}
