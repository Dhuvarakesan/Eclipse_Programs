/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * program that accepts three numbers from the user and prints "increasing" if the
   numbers are in increasing order, "decreasing" if the numbers are in decreasing order,
   and "Neither increasing or decreasing order" otherwise
 * @author dhuvarakesan
 * 27-04-2023
 */
public class CheckingOrder {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);// creating object for Scanner
		System.out.println("Input1:");
		int num1=in.nextInt();// getting input from user
		System.out.println("Input2:");
		int num2=in.nextInt();// getting input from user
		System.out.println("Input3:");
		int num3=in.nextInt();// getting input from user
		if(num1<num2&&num2<num3)
			System.out.println("Increasing order");
		else if(num1>num2&&num2>num3)
			System.out.println("Decreasing  order");
		else
			System.out.println("Neither increasing nor decreasing order");
		in.close();
	}

}
