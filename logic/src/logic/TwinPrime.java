/**
 * 
 */
package logic;

import java.util.Scanner;

/**
 *  program to find twin prime ex:3,5(difference of prime number should be 1)
 * @author dhuvarakesan
 * 2-6-2023
 */
public class TwinPrime {
	
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(Prime.prime(i)!=0&&Prime.prime(Prime.prime(i)+2)!=0)
				System.out.println(Prime.prime(i)+" "+Prime.prime(Prime.prime(i)+2));
		}

	}

}
