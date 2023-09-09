package training;
import java.util.Scanner;
public class Hillpattern1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("ENTER THE SIZE:");
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int k=0;k<=i;k++)
				System.out.print("*");
			for(int h=1;h<=i;h++)
				System.out.print("*");
			System.out.println();
		}
  in.close();
	}

}
