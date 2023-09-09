package logic;

import java.util.Scanner;

public class Fibonacci {
	public int fib(int n) {
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
		 Scanner in=new Scanner(System.in);
		 System.out.print("Enter The Number");
		 int num=in.nextInt();
		 Fibonacci a=new Fibonacci();
		 a.fib(num);
		 System.out.println(a.fib(num));
		 in.close();
		 }    
	}


