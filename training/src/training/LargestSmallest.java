package training;
import java.util.*;
import java.util.Arrays;
public class LargestSmallest {
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
System.out.println("Largest_2:"+arr[size-1]+","+arr[size-2]+"\n"+"Smallest:"+arr[0]+","+arr[1]);	
s.close();
}
}
