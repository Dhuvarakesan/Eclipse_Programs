package ilink;

import java.util.Collections;
import java.util.ArrayList;
import java.util.TreeSet;
public class Lexicographic_Order {

	public static void main(String[] args) {
		ArrayList <String> a1=new ArrayList <String> ();
		TreeSet<String> t1=new TreeSet<String>();
		a1.add("0");    //->Inputs
		a1.add("1");//->size 4
		a1.add("2");//->size 6
		a1.add("3");//->size 24
		a1.add("4");//->size 120
		a1.add("5");//->size 720
		a1.add("6");//->size 5040
		a1.add("7");//->Size 40320
		a1.add("8");//->Size 362880
		a1.add("9");//->Size??
					/*
					 * a1.add("6"); a1.add("7"); a1.add("8"); a1.add("9");
					 */
		String result="";
		for(;;) {
		Collections.shuffle(a1);
		for(String i:a1) {
		result+=i;
		}
		//System.out.println(result );
		t1.add(result);
		result="";
		System.out.println(t1.size());
		
		/* if(t1.size()==6) break; */ 
		 
		}
		//System.out.println(t1);
	}

	}


