package logic;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Input:");// it work for both the numbers and String without change in position;
		String in = sc.next();
		String output = "";

		Set<Character> st = new LinkedHashSet<Character>();
		
	
		for (int i = 0; i < in.length(); i++) {
			st.add(in.charAt(i));
		}
		Iterator<Character> itr = st.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
//		char []a=in.toCharArray();
//		for(char i:a) {
//		if(output.indexOf(i)==-1){
//			output+=i;
//		}
//		}
//			System.out.println(output);
//			sc.close();
	}

}
