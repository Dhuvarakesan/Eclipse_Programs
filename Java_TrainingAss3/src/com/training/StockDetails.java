/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * The policy followed by a company to process customer orders is given by the following
   rules: Suppose stock=100. If a customer order is less than or equal to that in stock and
   his credit is OK, supply his requirements. If his credit is not OK do not supply. Send him
   intimation. If his credit is OK but the item in stock is less than is order, supply the
   available stock and inform as ‘Out of stock. Balance will be refunded’.
 * @author dhuvarakesan
 * 27-04-2023
 */
public class StockDetails {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);// creating object for Scanner
		int stock=in.nextInt();// getting input from user
		int requirement=in.nextInt();
		String deal=in.next();
		if(stock>requirement&&deal.equals("N"))
			System.out.println(+requirement+" supplied");
		else if(stock>requirement&&deal.equals("Y"))
			System.out.println("Cannot supply");
		else if(stock<requirement&&deal.equals("N"))
			System.out.println(stock+" supplied. Out of stock. Balance will be refunded");
		in.close();

	}

}
