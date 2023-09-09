package logic;
import java.util.*;
public class Moondraft4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("SIZE:");
		int size=in.nextInt();
		int input[]=new int[size];
		System.out.print("\n"+"ARRAY ELEMENTS:");
		for(int i=0;i<size;i++)
			input[i]=in.nextInt();
		for(int i:input) {
			if(i>0)
				System.out.print(i+",");
		}
		int count=0;
		for(int i:input) {
			 count+=1;
			if(i<0) {
				System.out.print(i);
			if(count==input.length-1)
				break;
			System.out.print(",");
			}
		}
		in.close();
	}

}
