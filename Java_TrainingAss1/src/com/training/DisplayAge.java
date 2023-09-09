package com.training;

import java.util.Scanner;

/**
 * Declare a variable ‘age’. Assign a value to ‘age’ and print the value of age.
   Choose the correct datatype for age considering age as a whole number.
 * @author dhuvarakesan
 * 26-04-2023
 */
public class DisplayAge {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//scanner object creating
		System.out.println("Enter The Age:");
		int age=input.nextInt();//getting input from user
		System.out.println("The Age Is "+age);
		input.close();
	}

}
