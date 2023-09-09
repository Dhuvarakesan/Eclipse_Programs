package training;
import java.util.*;
public class ReverseDigit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER:");
		int num=s.nextInt();
		int reverse=0;
		while(num!=0) {
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println("REVERSED:"+reverse);
	s.close();
	}

}
