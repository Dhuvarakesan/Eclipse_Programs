/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * program to perform the following:
	a) Display the question “What is the unit of currency in India?”
	b) Accept the answer
 * @author dhuvarakesan
 * 27-04-2023
 */
public class DisplayTheQuestion {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("What is the unit of currency in India?");
		if((in.next().equals("Rupee")))
				System.out.println("Answer is correct");
		else {
			System.out.println("Try again!");
			if((in.next().equals("Rupee")))
				System.out.println("Answer is correct");
			else {
				System.out.println("Try again!");
				if((in.next().equals("Rupee")))
					System.out.println("Answer is correct");
				else
					System.out.println("Sorry it is Rupee");
			}
		}
		in.close();
	}

}
