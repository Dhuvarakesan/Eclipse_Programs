package logic;
import java.util.HashSet;
import java.util.*;
public class UniqueDigitcount {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    System.out.print("Enter The Input:");
		int input1=in.nextInt();
		String a=input1+"";
		char[] c=a.toCharArray();
		HashSet<Character> e=new HashSet<Character>();
		for(char i:c)
			e.add(i);
		System.out.println(e.size()); 
		in.close();
	}

}
