package logic;

import java.util.Scanner;

public class Seconddigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=s.nextInt();
		int rem=0;
		while(num!=0) {
			num=num/10;
			 rem=num%10;
			 System.out.println("Second Digit:"+Math.abs(rem));
			 break;
			}
		
	if(rem==0)
System.out.println("-1");
		
s.close();
}
}

