package logic;

import java.util.Arrays;

public class HackerRankQ2 {

	public static void main(String[] args) {
		String a="Today";
		String b="Kumar";
		System.out.println(a.charAt(a.length()/2));
		String res="";
		for(int i=a.length()/2;i<a.length();i++) {
			res+=Character.toString(a.charAt(i));
		}
		System.out.println(res);
		String t="";
		for(int i=(a.length()-1)/2;i>=0;i--) {
			t+=Character.toString(a.charAt(i));
		}
		int k=0;
		System.out.println(k-1);
		String input1="hello world";
		String[] str=input1.split(" ");
		System.out.println(Arrays.toString(str));
        System.out.println(t);
        System.out.println(res+t);
		if(a.charAt(0)>b.charAt(0))
			System.out.println("yes");
		else
			System.out.println("no");


	}

}
