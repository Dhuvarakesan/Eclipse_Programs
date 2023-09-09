package logic;

import java.util.Scanner;

public class WeightOfHillPattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter The Input1(total levels):");
		int input1=in.nextInt();//the total levels in a hill pattern (input1)
		System.out.print("\n"+"Enter The Input2(weight):");
		int input2=in.nextInt();//the weight of the head level (input2)
		System.out.print("\n"+"Enter The Input3(weight increment):");
		int input3=in.nextInt();//the weight increments of each subsequent level (input3)
		int sum=input2;
		int t=input2;
		for(int i=1;i<input1;i++) {
			t+=input3;
			for(int j=0;j<=i;j++) {
				sum+=t;
				System.out.print("t:"+t+" ");
                System.out.print("i:"+i+" "+"j:"+j);
				System.out.println("sum:"+sum);
				
				
			}
			
		}
		int result=sum;
		System.out.println(result);
		in.close();

	}

}
