package com.training;

/**
 * Take a 4-digit number. Write a program to display a number whose digits are 2 greater 
   than the corresponding digits of the number TAKEN. For example, if the number which 
   was taken is 5696, then the displayed number should be 7818
 * @author dhuvarakesan
 * 27-04-2023
 */
public class AddingTowtoDigits {
	public static int reverse(int num) {
		int reverse=0;
		while(num!=0) {
			int r=num%10;
			reverse=reverse*10+r;
			num/=10;
		}
		return reverse;
	}
	public static String addtwo(int num) {
		String result="";
		while(num!=0) {
			int r=num%10;
			if(r==9)
				result+=1+"";
			else if(r==8)
				result+=0+"";
			else
				result+=(r+2)+"";
			num/=10;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(addtwo(reverse(6548)));

	}

}
