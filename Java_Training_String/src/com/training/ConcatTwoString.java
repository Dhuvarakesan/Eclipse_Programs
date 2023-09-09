package com.training;

import java.util.Scanner;
/**
 * Java program to accept 2 strings (string1 and string2) from the user.
   Concatenate both the strings into a third string “string3” and print the result
 * @author dhuvarakesan
 * 4-5-2023
 */
public class ConcatTwoString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Input_1:");
		String str1=in.next();
		System.out.print("Input_2:");
		String str2=in.next();
		String str3=str1.concat(str2);
		System.out.println("Output:"+str3);
		in.close();
	}

}
