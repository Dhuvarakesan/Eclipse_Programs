/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * A teacher kept a record of the fruit that students like. This is what she found
 * @author dhuvarakesan
 * 27-04-2023
 */
public class StudentCalculation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int gOrange=in.nextInt();
		int gMango=in.nextInt();
		int bOrange=in.nextInt();	
	    int bMango=in.nextInt();
	    int cOrange=gOrange+bOrange;
	    int cMango=gMango+bMango;
	    int total=cMango+cOrange;
	    boolean flag=((gOrange+gMango)>(bOrange+bMango))?true:false;
	    System.out.println(cOrange+" "+cMango+" "+total+" "+flag);
	    in.close();
	}

}
