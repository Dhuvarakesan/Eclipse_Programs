package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PossiblePalindromee {

	public static void main(String[] args) {
		int num = 121;
		String a = Integer.toString(num);
		String[] str = new String[a.length()];
		int size = a.length();
		for (int i = 0; i < a.length(); i++) {
			str[i] = a.substring(size - 1, size);
			size--;
		}
		ArrayList<String> list = new ArrayList<String>();
		for (String i : str)
			list.add(i);
		int fact = 1;
		for (int i = a.length(); i >= 1; i--)
			fact *= i;
		System.out.println("fact:" + fact);
		for (String i : str)
			System.out.print(i + " ");
		System.out.println(list);
		for(int k=0;k<fact;k++) {
		String[] str1 = new String[list.size()];
		String[] str2 = new String[list.size()];
		Collections.shuffle(list);
		for (int j = 0; j < list.size(); j++)
			str1[j] = list.get(j);
		System.out.println("list");
		for(String i:str1)
			System.out.print(i+" ");
		Collections.reverse(list);
		for (int j = 0; j < list.size(); j++)
			str2[j] = list.get(j);
		System.out.println(" reversed list");
		for(String i:str2)
			System.out.print(i+" ");
		if (Arrays.equals(str1, str2)) {
			System.out.println("palindrome");
		break;
		}
		/*
		 * else { System.out.println("Not palindrome");}
		 */  /*for(int k=0;k<=fact;k++) {
				
				     break;
		 */

	}
}
}
