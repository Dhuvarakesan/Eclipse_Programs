package training;

import java.util.Arrays;

public class Withoutsplit {

	public static void main(String[] args) {
	  String in="my name is dhuvarakesan";
	  char[] a=in.toCharArray();
	  int size=1;
	  String str[]=new String[size];
	  for(int i=0;i<a.length;i++) {
		  if(a[i]==' ')
			  size++;
	  }
	  System.out.println(size);
	  String t="";
	  String res="";
	  int k=0;
	  int ee=0;
	  for( k=0;k<size;k++) {
	  for(int i=ee;i<a.length;i++) {
		  if(a[i]!=' ') {
			  t+=a[i]+"";
			  ee++;
		  }
		  else {
			 str[k]="";
			  str[k]=t;
			   t="";
			  ++ee;
			  
		  }
	  }
	  }
	  System.out.println(Arrays.toString(str));

	}

}
