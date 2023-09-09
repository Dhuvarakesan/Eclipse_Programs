package com.training;

import java.util.Scanner;

/**
 * Java program to accept a string from the user and calculate its length
 * @author dhuvarakesan
 * 4-5-2023
 */
public class CalaculateLength {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Input String:");
		String str=in.nextLine();
		System.out.println("String Length:"+str.length());
		in.close();
	}	

}
