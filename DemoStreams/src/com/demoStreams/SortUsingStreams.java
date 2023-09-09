package com.demoStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SortUsingStreams {

	public static void main(String[] args) {
		
		//List<Integer> number = Arrays.asList(1,2,3,4,5);
		ArrayList <Integer> number=new ArrayList<>();
		for(int i=1;i<9;i++)
			number.add(i);
	    System.out.println("Array list:"+number);
	    // demonstration of map method
	    //.map(x -> x*x)
	    List<Integer> square = number.stream().sorted(Comparator.reverseOrder()).
	                           collect(Collectors.toList());
	    System.out.println(" list in descending order:"+square);
	    square=number.stream().sorted().toList();
	    System.out.println(" list in ascending order:"+square);
	    
	}

}
