/**
 * 
 */
package com.training;

/**
 * program for swap numbers
 * @author dhuvarakesan
 * 27-04-2023
 */
public class SwapTwoNumbers {
    public static void withThird(int a,int b) {
    	int t=a;
    	a=b;
    	b=t;
    	System.out.println("WithThirdVariable A:"+a+"B:"+b);
    }
    public static void withOutThird(int a,int b) {
    	a=a+b;
    	b=a-b;
    	a=a-b;
    	System.out.println("WithOutThirdVariable A:"+a+"B:"+b);
    }
    public static void withXor(int a,int b) {
    	a=a^b;
        b=a^b;
        a=a^b;
    	System.out.println("WithXor A:"+a+"B:"+b);
    }
	public static void main(String[] args) {
		int a=6,b=7;
		withThird(a,b);//with third variable
		withOutThird(a,b);//without third variable
		withXor(a,b);//with xor operater
	}

}
