/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * Read a name from the console and greet the person. Read another name and
   greet that person as well. If ‘Laurel’ and ‘Hardy’ are the inputs, then the
   greeting should be ‘Welcome Laurel! Welcome Hardy too!’
 * @author dhuvarakesan
 * 26-04-2023
 */
public class ReadingInputFromUser {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String name1=in.nextLine();
		String name2=in.nextLine();
		System.out.println("Welcome " + name1 + "! Welcome " + name2 + " too!");
		in.close();
	}

}
