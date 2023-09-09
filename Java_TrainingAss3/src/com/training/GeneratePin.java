package com.training;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Secure Assets Private Ltd", a small company that deals with lockers has recently started 
   manufacturing digital locks which can be locked and unlocked using PINs (passwords). 
   You have been asked to work on the module that is expected to generate PINs using three 
   input numbers. Assumptions: The three given input numbers will always consist of three 
   digits each i.e. each of them will be in the range >=100 and <=999
 * @author dhuvarakesan
 * 27-04-2023
 */
public class GeneratePin {
	public static String maxOfNumbers(int num1,int num2,int num3) {
		String num=Integer.toString(num1)+Integer.toString(num2)+Integer.toString(num3);
		char [] arr=num.toCharArray();
		Arrays.sort(arr);
		String max=Character.toString(arr[arr.length-1]);
		return max;
	}
	public static int minOfThreeNumbers(int num1,int num2,int num3) {
		int min=Math.min(Math.min(num1, num2), num3);
		return min;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);// creating object for scanner
		System.out.print("Input1:");
		int input1=in.nextInt();// getting input from user
		System.out.print("\nInput2:");
		int input2=in.nextInt();//getting input from user
		System.out.print("\nInput3:");
		int input3=in.nextInt();//getting input from user
		String thousand=maxOfNumbers(input1,input2,input3);//finding thousands place of pin
		String hundred=Integer.toString(minOfThreeNumbers((input1/100),(input2/100),(input3/100)));// finding humdreds place of pin
		String tens=Integer.toString(minOfThreeNumbers((input1/10)%10,(input2/10)%10,(input3/10)%10));// finding tens place of pin
		String ones=Integer.toString(minOfThreeNumbers((input1%10),(input2%10),(input3%10)));// finding ones place of pin
		String result=thousand+hundred+tens+ones;
		System.out.println("Pin:"+result);//displaying results
		in.close();
	}

}
