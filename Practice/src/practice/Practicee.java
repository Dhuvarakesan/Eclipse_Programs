package practice;

import java.util.Arrays;
import java.util.Scanner;
public class Practicee {
	public static void main (String []args) {
		/*
		 * Scanner in=new Scanner(System.in); System.out.println("size:"); int
		 * n=in.nextInt(); System.out.println("elements:"); int arr[]=new int [n];
		 * for(int i=0;i<n;i++) arr[i]=in.nextInt(); for(int i=0;i<arr.length;i++) {
		 * for(int j=0;j<arr.length;j++) { if(arr[i]<arr[j]) { int t=arr[i];
		 * arr[i]=arr[j]; arr[j]=t; } } }
		 */
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int []arr=new int [size];
		for(int i=0;i<size;i++)
			arr[i]=in.nextInt();
		Arrays.sort(arr);
		int l_3=arr[arr.length-1]+arr[arr.length-2]+arr[arr.length-3];
		int s_2=arr[0]+arr[1];
		System.out.println(l_3);
		System.out.println(s_2);
	}

}
