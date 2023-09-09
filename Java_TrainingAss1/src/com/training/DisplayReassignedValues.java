/**
 * 
 */
package com.training;

/**
 * Declare four variables number1, number2, number3 and number4 of integer
   type. Assign the values of your choice for the variables number1, number2 and
   number3. Assign 1000 to number4. Print the values. Now re-assign the values
   as follows to print,
 * @author dhuvarakesan
 * 26-04-2023
 */
public class DisplayReassignedValues {

	public static void main(String[] args) {
		int number1=1;
		int number2=2;
		int number3=3;
		int number4=1000;
		System.out.println(number1+" "+number2+" "+number3+" "+number4);
		number4=number3;
		number3=number2;
		number2=number1;
		number1=100;
		System.out.println(number1+" "+number2+" "+number3+" "+number4);
	}

}
