package practice;
import java.util.Arrays;
import java.util.Scanner;
public class SortArrayElementsUsingBubbleSort {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Size:");
		int size=in.nextInt();
		System.out.print("\n"+"Array Elements:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=in.nextInt();
		for(int i=0;i<size-1;++i) { 
			for(int j=0;j<(size-i)-1;++j) { 
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
			
		in.close();

	}

}
