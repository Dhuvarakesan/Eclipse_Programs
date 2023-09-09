package training;
import java.util.*;
public class MaxMin{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Size:");
		int size=s.nextInt();
		System.out.print("\n");
		System.out.print("Elements:");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			int temp;
			if(arr[i]>arr[j]&&i!=j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}
		}
		System.out.println("Max: "+arr[0]+"\n"+"Min: "+arr[arr.length-1]);
s.close();
	}
}
