package training;

import java.util.Scanner;

public class SumOfPowerOfDigits {
public  void sumofpower(int n) {
	int size=0;
	String b=n+"";
	 size=b.length();
	
	int sum=0;
	while(n!=0) {
		int rem=n%10;
		int power=(int) Math.pow(rem, size);
		sum=sum+power;
		n=n/10;
	}
	System.out.println("Sum Of Power Of Digits:"+sum);
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=s.nextInt();
		SumOfPowerOfDigits a= new SumOfPowerOfDigits();
		a.sumofpower(num);
		
		s.close();

	}

}
