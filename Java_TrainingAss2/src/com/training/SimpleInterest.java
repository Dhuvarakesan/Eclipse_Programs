/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * The program must accept principal amount P, interest rate R and period in
   years N as the input. The program must calculate and print the simple interest
   value as the output.
 * @author dhuvarakesan
 * 27-04-2023
 */
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);//creating object for Scanner class
		System.out.println("Enter th Amount:");
		int P=in.nextInt();//getting input from user
		System.out.println("Enter th Rate:");
		int R=in.nextInt();//getting input from user
		System.out.println("Enter th Years:");
		int N=in.nextInt();//getting input from user
		int simpleInterest=(P*N*R)/100;
		System.out.println("Simple Interest:"+simpleInterest);
		in.close();
		

	}

}
