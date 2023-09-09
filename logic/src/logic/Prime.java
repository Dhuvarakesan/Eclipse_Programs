package logic;

import java.util.Scanner;

public class Prime {
	public static int prime(int num) {
		boolean  f= true;
		for(int i=2;i<num;++i) {
				if(num%i==0) {
					f=false;
					break;
				}
			}
			if(f) {
				//System.out.print(num+" "+"prime");
				return num;
			}
			else {
				//System.out.println("not a prime");
				return 0;
			}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=in.nextInt();
		prime(num);
			in.close();
	}

}
