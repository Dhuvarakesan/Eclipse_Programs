package com.training;
import java.util.Scanner;

public class LeapYears {

/**
* program for leap year
* @author dhuvarakesan
* 26-04-2023
*/

	public static boolean leapYear(int year) {
		return year%4==0?true:false;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int month=in.nextInt();
		int year=in.nextInt();
		if(month==1)
			System.out.println("January Has 31 Days");
		else if(month==2&&leapYear(year))
			System.out.println("February Has 29 Days");
		else if(month==2&&!leapYear(year))
			System.out.println("February Has 28 Days");
		else if(month==3)
			System.out.println("March Has 31 Days");
		else if(month==4)
			System.out.println("April Has 30 Days");
		else if(month==5)
			System.out.println("May Has 31 Days");
		else if(month==6)
			System.out.println("June Has 30 Days");
		else if(month==7)
			System.out.println("July Has 31 Days");
		else if(month==8)
			System.out.println("August Has 30 Days");
		else if(month==9)
			System.out.println("September Has 31 Days");
		else if(month==10)
			System.out.println("October Has 30 Days");
		else if(month==11)
			System.out.println("November Has 31 Days");
		else if(month==12)
			System.out.println("December Has 30 Days");
		in.close();
	}

}
