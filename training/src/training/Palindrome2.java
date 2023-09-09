package training;

import java.util.*;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
   String s1=s.nextLine();
   StringBuffer s2=new StringBuffer(s1).reverse();
   String s3=new String(s2);
   if(s1.equals(s3)) {
	   System.out.println("palindrome");
   }
   else {
   System.out.print("Not a Palindrome");
   }


 s.close();
}
}