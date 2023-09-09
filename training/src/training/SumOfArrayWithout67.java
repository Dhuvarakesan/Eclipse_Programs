package training;

import java.util.Scanner;

public class SumOfArrayWithout67 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Size:");
		int size=s.nextInt();
		System.out.print("\n");
		System.out.print("Elements:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int sum=0,i,j;
		for( i=0;i<size;i++) {
		if(arr[i]==6) {
			for( j=0;j<size;j++) {
				if(arr[j]==7) {
					i=j;
				}
			
		}
		}
		else {
		sum+=arr[i];
		}
		

}
		System.out.print("\n"+"Sum:"+sum);
}
}