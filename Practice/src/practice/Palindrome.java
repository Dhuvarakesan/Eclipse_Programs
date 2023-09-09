package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		StringBuffer s=new StringBuffer(str);
		s.reverse();
		if(str.equals(new String(s)))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		in.close();
	}

}
