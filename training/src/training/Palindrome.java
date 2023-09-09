package training;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter The Number:");
	int num=s.nextInt();
	int temp=num; 
	int rev=0;
	while(temp!=0) {
		int rem=temp%10;
		rev=rev*10+rem;
		temp/=10;
	}
	if(num==rev)
		System.out.print("Palindrome:"+rev);
	else
		System.out.print("Not Palindrome");
	s.close();
	}

}
