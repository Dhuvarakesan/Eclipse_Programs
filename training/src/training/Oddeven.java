package training;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Size:");
		int size=sc.nextInt();
		System.out.print("\n");
		System.out.print("Elements:");
		int[] arr=new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
			if(arr[i]%2==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}

	}
		System.out.print("[");
for(int i:arr) {
	System.out.print(i+" ");
}
System.out.print("]");
sc.close();
	}
}