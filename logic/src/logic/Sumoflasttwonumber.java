package logic;
import java.util.Scanner;
public class Sumoflasttwonumber {
	public  int lastdigit(int num) {
		int rem=0;
		while(num!=0) {
			 rem=num%10;
			break;
		}
		return Math.abs(rem);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num1=s.nextInt();
		System.out.print("\n");
		System.out.print("Enter The Number:");
		int num2=s.nextInt();
		Sumoflasttwonumber a=new Sumoflasttwonumber();
		int A=a.lastdigit(num1);
		int B=a.lastdigit(num2);
		int sum=A+B;
		System.out.println("sum:"+sum);
        s.close();
	}

}
