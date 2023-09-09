package training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CharacterOccurances {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String inString = scanner.next();
		
		char[] charAr = inString.toCharArray();
		List al =  Arrays.asList(charAr);
		System.out.println(al.toString()+al.size());
		for(char l : charAr) {
			System.out.println(l+":"+Collections.frequency(al, l));
		}
//		int k=0;
//		Set<Character> set = new LinkedHashSet<>();
//		for (int i = 0; i < inString.length(); i++) {
//			if(set.add(inString.charAt(i))) {
//				
//			}
//			
//		}
	}

}
