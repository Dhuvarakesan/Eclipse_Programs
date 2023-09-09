package training;
import java.util.*;
public class CheckPrime {
	public  void checkprime(int num) {
		 boolean f= true;
			for(int i=2;i<=num/2;++i) {
					if(num%i==0) {
						f=false;
						break;
					}
				}
				if(f)
					System.out.print("prime");
				else
					System.out.print("Not prime");
			
		
	}

	public static void main(String[] args) {
		  Scanner c=new Scanner(System.in);
		  System.out.print("Enter the Number:");
		  int num=c.nextInt();
		  CheckPrime a=new CheckPrime();
		  a.checkprime(num);
		 c.close();
}
}