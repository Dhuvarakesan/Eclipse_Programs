package practice;
import java.util.*;
public class Stringbuffertrial {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("INPUT:");
	String in=sc.next();
	//char a[]=in.toCharArray();
	StringBuilder s=new StringBuilder(in);
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='*') {
			/*
			 * System.out.println("posi:"+s.charAt(i));
			 * System.out.println("i:"+s.charAt(i)+(i));
			 */
			s.deleteCharAt(i);
		    //System.out.println("i-1:"+s.charAt(i-1)+(i-1));
			s.deleteCharAt(i-1);
		    //System.out.println("i+1:"+s.charAt(n-1)+(n-1));
	    	s.deleteCharAt(i-1);
		}
		
	}
	System.out.println(new String(s));
	sc.close();
}
}                                                        
