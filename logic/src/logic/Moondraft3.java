package logic;
import java.util.*;
public class Moondraft3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("INPUT:");
		String input=in.nextLine();
		for(int k=0;k<3;k++) {
		for(int i=k;i<input.length();i++) {
			for(int j=k;j<=i;j++) 
				System.out.print(input.charAt(j));
			 if(k==input.length()-1) 
				  break;
			 System.out.print(",");
		}
	  }
		in.close();

	}

}
