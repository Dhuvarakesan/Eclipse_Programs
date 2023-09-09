package com.training;

import java.util.Scanner;

/**
 * Professor wants to give extra assignments to students who scored lesser than
   the average score of class. Write a program to print the student IDs who are
   going to write the assignments if array of marks scored by the students is the
   input and the indexes are their IDs
 * @author dhuvarakesan
 * 29-04-2023
 */
public class CalculateAssignment {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//creating object for scanner
		int []arr=new int [10];//array declaration
		System.out.print("Elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
		int sum=0;
		for(int i:arr)
			sum+=i;//calculating sum
		int avg=sum/arr.length;//calculating average
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<avg) {
				System.out.print(i+" ");
			}
		}
		in.close();
	}

}
