package logic;

import java.util.Arrays;
import java.util.Scanner;

public class Moondraft5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("SIZE:");
		int size=in.nextInt();
		System.out.print("\n"+"ARRAY ELEMENTS:");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=in.nextInt();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		in.close();
	}

}
