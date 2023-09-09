package com.training;

import java.util.Scanner;

/**
 * Take 20 integer inputs from user and print the following:
	a) number of positive numbers
	b) number of negative numbers
	c) number of odd numbers
	d) number of even numbers
	e) number of 0s.
 * @author dhuvarakesan
 * 29-04-2023
 */
public class CountBasedOnCondition {
	//method for counting even numbers
	public static int evenCount(int arr[]) {
		int count=0;
		for(int i:arr) {
			if(i%2==0)
				count++;
		}
		return count;
	}
	//method for counting odd numbers
	public static int oddCount(int arr[]) {
		int count=0;
		for(int i:arr) {
			if(i%2!=0)
				count++;
		}
		return count;
	}
	//method for counting zero's 
	public static int zeroCount(int arr[]) {
		int count=0;
		for(int i:arr) {
			if(i==0)
				count++;
		}
		return count;
	}
	//method for counting positive numbers
	public static int positiveCount(int arr[]) {
		int count=0;
		for(int i:arr) {
			if(i>0)
				count++;
		}
		return count;
	}
	//method for counting negative numbers
	public static int negativeCount(int arr[]) {
		int count=0;
		for(int i:arr) {
			if(i<0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//creating object for Scanner
		int []arr=new int [20];//array declaration
		System.out.print("Elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();//getting inputs from user
		System.out.println("Number of Positive numbers:"+positiveCount(arr));
		System.out.println("Number of Negative numbers:"+negativeCount(arr));
		System.out.println("Number of Odd numbers:"+oddCount(arr));
		System.out.println("Number of Even numbers:"+evenCount(arr));
		System.out.println("Number of Zero's:"+zeroCount(arr));
		in.close();
	}

}
