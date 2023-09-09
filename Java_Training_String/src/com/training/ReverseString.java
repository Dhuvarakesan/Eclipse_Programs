package com.training;

import java.util.Scanner;
/**
 * program for reverse string
 * @author dhuvarakesan
 * 5-5-2023
 */
public class ReverseString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Input:");
		System.out.println("Reversed:"+new StringBuffer(in.next()).reverse());
		in.close();
	}

}
