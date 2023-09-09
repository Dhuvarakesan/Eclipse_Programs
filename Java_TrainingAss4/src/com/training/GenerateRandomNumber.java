package com.training;
import java.util.Arrays;
/**
 * program to throw 10 dices and store the dice values in an array. Libraries
   can be used to generate random numbers
 * @author dhuvarakesan
 * 29-04-2023
 */
public class GenerateRandomNumber {

	public static void main(String[] args) {
		int []arr=new int[10];
		int size=0;
		for(;;) {
			int t=(int)(Math.random()*10)%7;
			if(t>0)
				arr[size++]=t;
			if(size==10)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}

}
