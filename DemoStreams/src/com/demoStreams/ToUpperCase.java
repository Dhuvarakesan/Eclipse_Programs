package com.demoStreams;
import java.util.ArrayList;
import java.util.List;

/**
 * program for uppercase the each using list
 * @author dhuvarakesan
 * 19-05-2023
 */

public class ToUpperCase {

	public static void main(String[] args) {
		ArrayList <String> name=new ArrayList<>();
		name.add("dhuvarakesan");
		name.add("jagadeesh");
		name.add("gokul");
		name.add("dhuvarakesan");
		List <String> s=name.stream().map(String::toUpperCase).toList();
		System.out.println(s);
	}

}
