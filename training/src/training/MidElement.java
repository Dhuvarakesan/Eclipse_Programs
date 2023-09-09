package training;

import java.util.Scanner;

public class MidElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr1=new int[3];
		System.out.print("Array_1(only 3 elements):");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=s.nextInt();
		}
		System.out.print("\n");
		int[] arr2=new int[3];
		System.out.print("Array_2(only 3 elements):");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=s.nextInt();
		}
		int[] mid=new int[2];
		mid[0]=arr1[1];
		mid[1]=arr2[1];
System.out.println("["+mid[0]+","+mid[1]+"]");
	s.close();
	}

}
