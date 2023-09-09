/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * Mike enters randomly twenty-five numbers from the keyboard and stores it into
   an array. He wants to search if the number is present in the array and if it is
   present, he needs to display the number of times it appears in the array. Help
   him with your program.
 * @author dhuvarakesan
 * 29-04-2023
 */
public class SearchNumber {
	public static int searchAndCount(int arr[],int element) {
		int count=0;
		for(int i:arr) {
			if(i==element)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int [] arr=new int[25];
		System.out.println("Elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
		System.out.print("Enter the Search Element:");
		int searchElement=in.nextInt();
		System.out.println("Count:"+searchAndCount(arr,searchElement));
		in.close();
	}

}
