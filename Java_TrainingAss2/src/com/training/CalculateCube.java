/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * program to find the cube of the given number.
 * @author dhuvarakesan
 * 27-04-2023
 */
public class CalculateCube {
	public static int cube(int a) {
		return a*a*a;
	}
	
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);//creating object for Scanner class
		System.out.println("Enter th Value:");
		int input=in.nextInt();//getting input from user
		System.out.println("Cube value:"+cube(input));//calling and displaying
		in.close();
	}

}
