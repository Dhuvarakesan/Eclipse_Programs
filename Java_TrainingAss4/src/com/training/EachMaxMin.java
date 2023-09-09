package com.training;

import java.util.Scanner;

/**
 * Write a program to find the minimum and maximum element of each row and
   column in the given two-dimensional arrays
 * @author dhuvarakesan
 * 29-04-2023
 */
public class EachMaxMin {
	public static void maxMin(int arr[][],int row,int col) {
		for(int i=0;i<row;i++) {
			int rmax=0;
			int rmin='!';
			for(int j=0;j<row;j++) {
				if(arr[i][j]>rmax)
					rmax=arr[i][j];
			}
			for(int j=0;j<row;j++) {
				if(arr[i][j]<rmin)
					rmin=arr[i][j];
			}
			System.out.println("The minimum and maximum element of "+(i+1)+" row:"+rmin+" "+rmax);
	}
			for(int i=0;i<col;i++) {
				int cmax=0;
				int cmin='!';
			for(int j=0;j<col;j++) {
				if(arr[j][i]>cmax)
					cmax=arr[j][i];
			}
			for(int j=0;j<col;j++) {
				if(arr[j][i]<cmin)
					cmin=arr[j][i];
			}
			System.out.println("The minimum and maximum element of "+(i+1)+" column:"+cmin+" "+cmax);
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter row size:");
		int rSize=in.nextInt();
		System.out.print("\nEnter column size:");
		int cSize=in.nextInt();
		System.out.print("\nEnter "+rSize+" * "+cSize+" array elements are:"); //4 1 2 5 3 6 3 7 8
		int arr[][]= new int[rSize][cSize];
		for(int i=0;i<rSize;i++)
			for(int j=0;j<cSize;j++)
				arr[i][j]=in.nextInt();
		maxMin(arr,rSize,cSize);
		in.close();
		

	}

}
