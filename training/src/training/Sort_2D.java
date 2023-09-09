package training;

import java.util.Scanner;

public class Sort_2D {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int [][]arr= new int [2][2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					for(int l=0;l<arr.length;l++) {
						if(arr[i][j]<arr[k][l]) {
							int temp;
							temp=arr[i][j];
							arr[i][j]=arr[k][l];
							arr[k][l]=temp;
						}
				}
			
			}
			}

	}
		System.out.println("The Given Array is:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+" ");	
			}
			System.out.print("\n");	
			
		}
		// for reverse the 2d array
		System.out.println("The Reverse Of The Array is:");
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[i][j]+" ");	
			}
			System.out.print("\n");	
			
		}
s.close();
}
}
