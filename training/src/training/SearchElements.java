package training;
import java.util.*;
public class SearchElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Size:");
		int size=s.nextInt();
		System.out.print("\n");
		int[] arr=new int[size];
		System.out.print("Elements:");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("\n");
		System.out.print("Target:");
		int tar=s.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			if(arr[i]==tar) {
				System.out.println(i);
			count+=1;
			break;
		}
			}
		if(count==0)
			System.out.println("-1");
s.close();		}
	
}
