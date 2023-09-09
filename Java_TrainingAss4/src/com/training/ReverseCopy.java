package com.training;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Take 10 integer inputs from user and store them in an array. Now, copy all the
   elements in another array but in reverse order
 * @author dhuvarakesan
 * 29-04-2023
 */
public class ReverseCopy {
	public static void reverseCopy(int arr[]) {
		int []duplicate=new int [arr.length];
		int size=0;
		for(int i=arr.length-1;i>=0;i--) {
			duplicate[size++]=arr[i];
		}
		System.out.println("Reversed Array "+Arrays.toString(duplicate));
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int []arr=new int[10];
		System.out.print("Elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
		reverseCopy(arr);
		in.close();
	}

}
