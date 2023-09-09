package com.training;

import java.util.Scanner;

/**
 * program for replace vowels
 * @author dhuvarakesan
 * 5-5-2023
 */
public class ReplaceVowels {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Input:");
		String str=in.next();
		String output=str.replaceAll("[aeiouAEIOU]","Z");
		if(str.contains("[aeiou]"))
			System.out.println("Word : "+output);
		else
			System.out.println(false);

	}

}
