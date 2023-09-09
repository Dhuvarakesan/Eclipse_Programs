package training;
import java.util.Scanner;
public class Hillpattern2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("ENTER THE SIZE:");
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			int num=1;
			for(int k=0;k<=i;k++)
				System.out.print(num++);
			for(int k=1;k<=i;k++) {
				if(k<i)
					System.out.print(num++);
				else if(k==i)
					System.out.print("1");
			}
			System.out.println();
		}
     in.close();
	}

}