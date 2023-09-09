package com.training;

import java.util.Scanner;

/**
 * program to initialize an integer array with N values from the user and find the
   maximum and minimum value of an array.
 * @author dhuvarakesan
 * 29-04-2023
 */
public class MaxMin {
	public static int max(int arr[]) {
		int max=0;
		for(int i:arr) {
			if(i>max)
				max=i;
		}
		return max;
	}
	public static int min(int arr[]) {
		int min='!';
		for(int i:arr) {
			if(i<min)
				min=i;
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//creating object for Scanner
		System.out.print("Size:");
		int size=in.nextInt();//getting size from user
		int []arr=new int [size];//array declaration
		System.out.println("Elements:");
		for(int i=0;i<size;i++)
			arr[i]=in.nextInt();
		System.out.println("Max:"+max(arr));
		System.out.println("Min:"+min(arr));
		in.close();
	}

}
