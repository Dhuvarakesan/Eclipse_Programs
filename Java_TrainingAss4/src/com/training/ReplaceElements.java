package com.training;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class ReplaceElements {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int []arr=new int[9];
		int size=0;
		for(;;) {
			int t=in.nextInt();
			if(t>0)
				arr[size++]=t;
			else
				break;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0&&arr[i]%8!=0) {
				arr[i]=0;
				//continue;
			}
			else if(arr[i]%2!=0&&arr[i]%9!=0) {
				arr[i]=1;
				//continue;
			}
			else if(arr[i]%8==0) {
				arr[i]=2;
				//continue;
			}
			else if(arr[i]%3==3) {
				arr[i]=3;
				//continue;
			}
			else if(arr[i]%9==0) {
				arr[i]=4;
				//continue;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
