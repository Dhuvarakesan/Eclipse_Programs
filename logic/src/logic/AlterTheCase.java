package logic;

import java.util.Scanner;

public class AlterTheCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE INPUT:");
		String input=sc.next();
		String result="";
		for(int h=0;h<input.length();h++){
	           if(Character.isUpperCase(input.charAt(h))){
	        	   result+=String.valueOf(Character.toLowerCase(input.charAt(h)));
	           }
	           else{
	        	   result+=String.valueOf(Character.toUpperCase(input.charAt(h)));
	           }
	       }
		System.out.println("OUTPUT:"+result);
		sc.close();
	}

}
