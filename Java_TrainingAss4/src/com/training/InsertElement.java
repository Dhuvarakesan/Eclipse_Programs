package com.training;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to accept n numbers from console. Then insert an element
   at the specified position of the array
 * @author dhuvarakesan
 * 29-04-2023
 */
public class InsertElement {
	public static void insert(int arr[],int element,int pos) {
		int arrNew[]=new int[arr.length+1];
		int size=0;
		for(int i=0;i<arrNew.length;i++) {
			if(size<pos-1) {
				arrNew[size++]=arr[i];
			}else {
				if(size==pos-1)
					arrNew[size++]=element;
				else 
					  arrNew[i]=arr[i-1]; 
			}
		}		
		System.out.println(Arrays.toString(arrNew));	
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Size:");
		int size=in.nextInt();
		System.out.println("Elements:");
		int []arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=in.nextInt();
		System.out.println("Inserting Number:");
		int newNumber=in.nextInt();
		System.out.println("Position:");
		int position=in.nextInt();
		insert(arr,newNumber,position);
		in.close();
	}

}
