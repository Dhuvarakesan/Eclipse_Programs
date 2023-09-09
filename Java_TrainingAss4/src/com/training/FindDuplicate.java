/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * program to find duplicate elements in the array. If not return -1
 * @author dhuvarakesan
 * 29-04-2023
 */
public class FindDuplicate {
	public static void duplicate(int arr[]) {
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j]&i!=j) {
					flag=false;
					System.out.print(arr[j]+" ");
				}
					
			}
		}
		if(flag)
			System.out.println("-1");
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//creating object for scanner
		int arr[]=new int[7];///array declaration
		System.out.print("Enter 7 elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt(); //getting each from user 
		duplicate(arr);//call user defined duplicate method  
		in.close();

	}

}
