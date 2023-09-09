package training;
import java.util.*;
public class SumOfDigit {
	public static void  sumofdigit(int digit) {
		int sum;
		for( sum=0;digit!=0;digit/=10) {
			int rem=digit%10;
			sum=sum+rem;
			//digit/=10;
		}
		System.out.println("Sum of Digit:"+sum);	
	}
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in); 
	System.out.print("Enter The Number:");
	int digit=s.nextInt();
	sumofdigit(digit);
    s.close();
	}
	
}
