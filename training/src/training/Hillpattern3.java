package training;

import java.util.Scanner;

public class Hillpattern3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("ENTER THE SIZE:");
		int n=in.nextInt();
		int alph=65;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int k=0;k<=i;k++)
				System.out.print((char)alph++);
			for(int h=1;h<=i;h++)
				System.out.print((char)alph++);
			System.out.println();
		}
		alph=65;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int k=0;k<=i;k++)
				System.out.print((char)alph);
			for(int h=1;h<=i;h++)
				System.out.print((char)alph);
			alph++;
			System.out.println();
		}
in.close();
	}

}
