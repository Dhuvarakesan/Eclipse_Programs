package practice;
import java.util.*;
public class Swapingtwonumberswithoutusingthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("A:");
		int a=in.nextInt();
		System.out.print("\n"+"B:");
		int b=in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A:"+a);
		System.out.println("B:"+b);
in.close();
	}

}
