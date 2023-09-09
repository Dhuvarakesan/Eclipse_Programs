package com.training;

import java.util.Arrays;
import java.util.Scanner;

/**
 * program to accept n numbers from console. Then delete an element
   at the specified position of the array
 * @author dhuvarakesan
 * 29-04-2023
 */
public class DeleteElement {
	public static void delete(int []arr,int pos) {
		int array[]=new int [arr.length-1];
		for(int i=0;i<arr.length;i++) {
			if(i<pos-1)
				array[i]=arr[i];
			else {
				if(i==pos-1)
					continue;
				else 
					array[i-1]=arr[i];
			}
		}
		System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Size:");
		int size=in.nextInt();
		int arr[]=new int [size];
		System.out.println("Elements:");
		for(int i=0;i<size;i++)
			arr[i]=in.nextInt();
		System.out.println("Position:");
		int position=in.nextInt();
        delete(arr,position);
        in.close();
	}

}
