package logic;

import java.util.Scanner;

public class OddEvenNewLogic {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
		Scanner in =new Scanner(System.in);
		System.out.print("INPUT:");
		int a=in.nextInt();
		String arr[]= {"EVEN","ODD"};
		System.out.println(arr[a%2]);
		}
	}

}
