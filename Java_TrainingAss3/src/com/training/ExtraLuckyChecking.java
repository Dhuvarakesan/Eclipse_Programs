/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * Given 2 integer values, ‘a’ and ‘b’, return their sum. However, "teen" values in the range
   13…19 inclusive, are extra lucky. So, if either value is a teen, just return 19.
 * @author dhuvarakesan
 * 27-04-2023
 */
public class ExtraLuckyChecking {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);// creating object for scanner
		int a=in.nextInt();// getting input from user
		int b=in.nextInt();// getting input from user
		if((a>10&&a<20)||(b>10&&b<20)) {
			System.out.println("19");
		}
		else {
			System.out.println(a+b);
		}
		in.close();
	}

}
