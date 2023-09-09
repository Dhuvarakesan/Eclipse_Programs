package training;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int size=s.nextInt();
		for(int i=size;i>=0;i--) {
			for(int j=i;j<size;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	s.close();
	}

}
