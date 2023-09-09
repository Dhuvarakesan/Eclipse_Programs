package com.training;

import java.util.Scanner;

/**. 
 * During lockdown, ATMs were allowed to dispatch currencies in specific way. If user enters 
   the amount, which is not multiple of 500 transactions will be rejected. If amount is 500 
   exactly, then 5 currencies of 100 will be dispatched by machine. If amount is between 500 
   to 2000 you will get 500 in the form of 100s currencies, rest 500s currencies. If amount is 
   greater than 2000, then 2000 currencies will be dispatched and rest will be dispatched in 
   the denomination of 500, last 500 will be in the denomination of 100
 * @author dhuvarakesan
 * 27-04-2023
 *
 */
public class DispatchCurrencies {
	public static void lessThan500(int amt) {
		System.out.println("please enter the amount multiple of 500");
	}
	public static void lessThan2000(int amt) {
		int t=amt/500;
		System.out.println(" 5 notes on 100 & "+(t-1)+" notes on 500");
	}
	public static void greaterThan2000(int amt) {
		int t=amt/2000;
		System.out.println(" 5 notes on 100,"+(t)+" notes of 2000, 1 notes of 500");
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Amount:");
		int amount=in.nextInt();
		if(amount>500) {
			if(amount>500&&amount<=2000)
				lessThan2000(amount);//calling method for less than 2000 and greater than 500 scenario
			else if(amount>2000)
				greaterThan2000(amount);//calling method for greater than 2000 scenario
		}
		else
			lessThan500(amount);//calling method for less than 500 scenario
		in.close();	
			
	}

}
