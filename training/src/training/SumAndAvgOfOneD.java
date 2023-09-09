package training;
import java.util.*;
public class SumAndAvgOfOneD {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Size:");
		int size=s.nextInt();
		System.out.print("\n");
		int sum=0;
		int avg=0;
		System.out.print("Enter The Array Elements:");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		avg=sum/size;
		System.out.println("Sum:"+sum+"\n"+"Average:"+avg);
	s.close();
	}

}
