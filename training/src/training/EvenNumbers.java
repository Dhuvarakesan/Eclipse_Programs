package training;
import java.util.*;
public class EvenNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Starting Number:");
		int start=s. nextInt();
		System.out.println();
		System.out.print("Ending Number:");
		int end=s. nextInt();
		if(start<end) {
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}
		else {
			System.out.println("Invalid Input");
		}
s.close();
}
}
