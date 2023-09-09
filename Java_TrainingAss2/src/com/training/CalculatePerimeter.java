/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * program to find the perimeter of a rectangle if the sides were the
   inputs. Formula: Perimeter = 2L + 2B or 2*(L+B)
 * @author dhuvarakesan
 * 26-04-2023
 */
public class CalculatePerimeter {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//creating object for Scanner
		System.out.println("Enter The Length:");
		double length=in.nextDouble();//getting input from user
		System.out.println("Enter The breadth:");
		double breadth=in.nextDouble();//getting input from user
		double Perimeter=2*(length+breadth);//calculating perimeter
		System.out.println("Perimeter Value:"+Perimeter);//Displaying perimeter
		in.close();
	}

}
