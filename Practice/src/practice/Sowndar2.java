package practice;

import java.util.Arrays;
import java.util.ArrayList;
public class Sowndar2 {

	public static void main(String[] args) {
	  String[]a=new String[] {"TREAT","TREAD","BREAD","BROAD","BROOD"};
	  ArrayList<Character> a1=new ArrayList<Character>();
	  ArrayList<Character> a2=new ArrayList<Character>();
	  int x=0;
	  boolean f=false;
	  String res="";
	  for(int i=0;i<a.length;i++) {
		  char ch[]=a[i].toCharArray();
		  for(char g:ch)
			  a1.add(g);
		  
		  
		  for(int j=0;j<ch.length;j++) {
			  a1.remove(i);
			  a1=a2;
			  if(a1.containsAll(a2)) {
				  res=a1.toString();
				  f=true;
				  break;
				  }
		  }
		  if(f) {
			  System.out.println(res);
			  break;
		  }
	  }
		
	  
		  }
	  }

	


