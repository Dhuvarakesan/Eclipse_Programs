/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * A factory manufactured LED bulbs on the first day. On the second day it
   made CFL bulbs. How many bulbs did the factory make altogether? Counts
   are the input.
 * @author dhuvarakesan
 * 27-04-2023
 */
public class AddNumbers {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);//creating object for Scanner class
		System.out.println("Enter the Value of LED bulbs on the first day:");
		int bulbs1=in.nextInt();//getting input from user
		System.out.println("Enter the Value LED bulbs on the second day:");
		int bulbs2=in.nextInt();//getting input from user
        int total=bulbs1+bulbs2;
        System.out.println("Total Count:"+total);
        in.close();
	}

}
