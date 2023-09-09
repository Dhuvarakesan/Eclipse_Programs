/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * program to add 8 to the given number and then divide it by 3. Now,
   the modulus of the quotient is taken with 5 and then multiply the resultant
   value by 5. Display the result.
 * @author dhuvarakesan
 * 27-04-2023
 */
public class CalculateMathEquation {
	public static int CalculateEqu(int num) {
		return (((num+8)/3)%5)*5;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("INPUT:");
		int input=in.nextInt();
		System.out.println("Result:"+CalculateEqu(input));
		

	}

}
