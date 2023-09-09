package ilink;
import java.util.Scanner;
public class Fibonacci {
	static int fibonacci(int n) {
			int n1=0;
			int n2=1;
			int n3=0;
			//System.out.print(n1+" "+n2+" ");
			if(n==1) {
				return n1;
			}
			else if(n==2) {
				return n2;
			}
			else {
			for(int i=2;i<n;i++){    
				  n3=n1+n2;
				 // System.out.print(n3+" ");
				  n1=n2;    
				  n2=n3;    
				 }
		return n3;
		}
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Result:"+fibonacci(input.nextInt()));
		input.close();

	}

}
