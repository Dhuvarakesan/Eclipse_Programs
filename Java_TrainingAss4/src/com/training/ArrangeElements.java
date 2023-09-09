package com.training;

import java.util.Arrays;
import java.util.Scanner;

/**
 * a program to arrange the elements of a given array of integers where
   all positive integers appear before all the negative integers
 * @author dhuvarakesan
 * 29-04-2023
 */
public class ArrangeElements {
	public static int[] arrange(int []arr) {
		int array[]=new int [arr.length];
		int size=0;
		for(int i=0;i<array.length;i++)
			if(arr[i]>0)
				array[size++]=arr[i];
		for(int i=0;i<array.length;i++)
			if(arr[i]<0)
				array[size++]=arr[i];
		return array;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arr[]=new int [10];
		System.out.println("Enter 10 Numbers:");
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
		System.out.println(Arrays.toString(arrange(arr)));
		in.close();

	}

}
