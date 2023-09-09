package ilink;
import java.util.Scanner;
public class factdigitsum {
	 static  long fact(int n) {
	    if (n==0)
	    	return 1;
	    else
	    	return (n*fact(n-1));
	        
	}
	 static long Sum_Digits(long n) {
		 long sum=0;
		 while(n!=0) {
			 long rem=n%10;
			 sum+=rem;
			 n/=10;
		 }
		 return sum;
	 }
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int input1=input.nextInt();
		System.out.println(fact(input1));
		long results=Sum_Digits(fact(input1));
		System.out.println(results);
		input.close();
		

	}

}
