package training;

import java.util.Scanner;

public class CheckOneOrFour {

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
		int count=size;
		for(int i=0;i<size;i++) {
			if(arr[i]==1||arr[i]==4)
				count--;
		}
		if(count==0)
			System.out.print(true);
		else
			System.out.print(false);
	sc.close();
	}

}
