package com.training;

import java.util.Scanner;
/**
 * Write a program to find the sum, average and product of all elements of an array of
   size 5
 * @author dhuvarakesan
 * 29-04-2023
 */

public class CalculateSumProduct {
	public static int sum(int arr[]) {
		int sum=0;
		for(int i:arr)
			sum+=i;
		return sum;
	}
	public static int product(int arr[]) {
		int pro=1;
		for(int i:arr)
			pro*=i;
		return pro;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int []arr=new int[5];
		System.out.print("Elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
		System.out.println("Sum:"+sum(arr));
		System.out.println("Product:"+product(arr));
		System.out.println("Average:"+sum(arr)/arr.length);
		in.close();
	}

}
