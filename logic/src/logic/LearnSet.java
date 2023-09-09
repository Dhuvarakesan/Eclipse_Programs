package logic;

import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		TreeSet<Integer>s1=new TreeSet<>();
		for(int i=0;i<10;i++) {
			s1.add(i);
		}
		System.out.println(s1.first());
		boolean f=s1.contains(3);
		
		System.out.println(f);
		int a=s1.first()+4;
		int b=s1.last();
		System.out.println(a+" "+b);
		

	}

}
