package logic;

import java.util.Scanner;

public class Moondraft2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("SIZE:");
		int size=in.nextInt();
		System.out.println();
		System.out.print("ARRAY ELEMENTS:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=in.nextInt();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int k:arr) {
				sum+=k;
			}
			System.out.print(sum-arr[i]);
			if(i==size-1) {
			break;	
			}
			System.out.print(",");
			sum=0;
		}
		in.close();
	}

}
