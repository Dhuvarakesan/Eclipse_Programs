package training;
import java.util.*;
public class Sort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Size:");
		int size=s.nextInt();
		System.out.print("\n");
		System.out.print("Elements:");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int i:arr)
		System.out.print(i+" ");
	s.close();
	}

}
