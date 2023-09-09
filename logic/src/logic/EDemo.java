package logic;
import java.util.*;
public class EDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = b;
		int sum = b;
		for(int i = 1;i<a;i++) {
			s += c;
			System.out.println(s);
			for(int j = 0;j<=i;j++)
			 sum += s;
		}
		System.out.println(sum);
		sc.close();
		}
}	



