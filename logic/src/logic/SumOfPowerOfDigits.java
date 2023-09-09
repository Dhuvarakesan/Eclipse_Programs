package logic;

import java.util.Scanner;

public class SumOfPowerOfDigits {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=in.nextInt();
		int pow=0;
		String length=num+"";
		int size=length.length();
		int[] arr=new int[size];
		int sum=1;
		int i=0;
		while(num!=0) {
			int rem=num%10;
			arr[i]=rem;
			i+=1;
			num/=10;
			}
	for(int k=1;k<size;k++) {
		pow=(int)Math.pow(arr[k],arr[k-1]);
		System.out.print("K:"+k+" "+"k-1:"+(k-1)+" ");
		System.out.print("power:"+pow+" ");
		System.out.println("sum:"+sum+" ");
		sum+=pow;
	}
		System.out.println("Sum Of Power Of Digit:"+sum);	
	in.close();	
	}

	}


