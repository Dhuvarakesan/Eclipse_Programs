/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * program to reverse a 3-digit number
 * @author dhuvarakesan
 * 27-04-2023
 */
public class ReverseDigit {
	public static int reverse(int num) {
		int reverse=0;
		while(num!=0) {
			int rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
			}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);//creating object for Scanner class
		System.out.println("Enter th Value:");
		int input=in.nextInt();//getting input from user
		System.out.print(reverse(input));
		in.close();
	}

}
