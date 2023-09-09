package logic;

import java.util.Arrays;
import java.util.Scanner;

public class High3of5input {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("INPUT1:");
		int input1=in.nextInt();
		System.out.print("\n"+"INPUT2:");
		int input2=in.nextInt();
		System.out.print("\n"+"INPUT3:");
		int input3=in.nextInt();
		System.out.print("\n"+"INPUT4:");
		int input4=in.nextInt();
		System.out.print("\n"+"INPUT5:");
		int input5=in.nextInt();
		int sum=0;
		int[] all=new int[]{input1,input2,input3,input4,input5};
		for(int i=0;i<all.length;i++) {
			String s1=Integer.toString(input1);
			char[]a=s1.toCharArray();
			Arrays.sort(a);
			String r1=String.valueOf(a[a.length-1])+String.valueOf(a[a.length-2])+String.valueOf(a[a.length-3]);
			sum+=Integer.parseInt(r1);
		}
		System.out.println("Sum:"+sum);
		in.close();
	}

}
