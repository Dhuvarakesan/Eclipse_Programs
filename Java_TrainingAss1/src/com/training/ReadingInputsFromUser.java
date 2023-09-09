/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * Read a person name first, read another person and another. Greet the first
   person first, third person second and the second person last. If ‘Chloe’, ‘Joey’
   & ‘Zoe’ are the inputs, then the output will be ‘Welcome Chloe! Welcome Zoe!
   Welcome Joey too!’
 * @author dhuvarakesan
 * 26-04-2023
 */
public class ReadingInputsFromUser {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//creating scanner object
		String name1=in.nextLine();//getting input from user
		String name2=in.nextLine();//getting input from user
		String name3=in.nextLine();//getting input from user
		System.out.println("Welcome " + name1 + "! Welcome " + name2+ "! Welcome " + name3 +  " too!");
		in.close();

	}

}
