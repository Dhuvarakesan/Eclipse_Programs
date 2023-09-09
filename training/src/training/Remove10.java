package training;

import java.util.Arrays;
import java.util.Scanner;

public class Remove10 {

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
	if(arr[i]==10) {
		arr[i]=0;
	}
}
Arrays.sort(arr);
System.out.print("[");
for(int i:arr) {
	System.out.print(i);
	System.out.print(",");
	}
System.out.print("]");
	sc.close();
	}

}
