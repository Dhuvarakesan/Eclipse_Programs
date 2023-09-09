/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * program that accepts an integer D which denote the diameter of a
   circle as the input. The program must print the circumference of the circle as
   the output.
 * @author dhuvarakesan
 * 27-04-2023
 */
public class CalculateCirclelCircum {

	public static double calculate(int num) {
		return (2*(Math.PI*num));
	}
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);//creating object for Scanner class
		System.out.println("Enter th Value:");
		int input=in.nextInt();//getting input from user
		System.out.println("Result:"+calculate(input));//display results
		in.close();
	}

}
