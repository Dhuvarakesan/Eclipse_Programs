package com.training;
import java.util.Scanner;

/**
 * Write a program if an integer variable currentNumber is odd, change its value so that it is 
   now 3 times currentNumber plus 1, otherwise change its value so that it is now half of 
   currentNumber.
 * @author dhuvarakesan
 * 27-04-2023
 */
public class ChangeValueBasedOnCondition {
	public static int changeBasedOnOdd(int num) {
		return num=(num*3)+1;
	}
	public static int changeBasedOnEven(int num) {
		return num/2;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int number=in.nextInt();
		System.out.println(number%2==0?changeBasedOnEven(number):changeBasedOnOdd(number));
		in.close();
	}

}
