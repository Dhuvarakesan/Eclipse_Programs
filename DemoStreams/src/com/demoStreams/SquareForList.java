package com.demoStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * program for calculating square for list(1-10)
 * @author dhuvarakesan
 * 19-05-2023
 */
public class SquareForList {

	public static void main(String[] args) {
		ArrayList<Integer> number=new ArrayList<>();
		for(int i=1;i<=10;i++)
			number.add(i);
		List <Integer> square= number.stream().map(X -> X*X).toList();
		System.out.println("Squared list: "+square);
		//displaying in descending order
		square=square.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("Descending Ordered List: "+square);
	}

}
