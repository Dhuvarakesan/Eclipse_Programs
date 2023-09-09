package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Removeonenumberandcheckpalindrome {
	public static void main(String[] args) {
		int input1=12332;//251532 12332 10101 981894
		String in=Integer.toString(input1);
		   String inn[]=new String[in.length()];
		   int size=in.length();
		   for(int i=0;i<in.length();i++){
			   inn[i]=in.substring(size-1, size);
			   size--;
		   }
		   int fact=1;
		   for(int i=in.length();i>=0;i--)
		   fact*=i;
		   System.out.println(Arrays.toString(inn));
		   int temp=0;
		   int ii=0;
		   int r=0;
		   for( ii=0;ii<in.length();ii++){
			   ArrayList<String> l1=new ArrayList<>();
			   for(int h=0;h<fact;h++){
				   String s1 ="";
				   String s2 =""; 
			   for(int k=0;k<in.length();k++){
				   	if(k!=ii)
				    l1.add(inn[k]);}
			   for(String s:l1)
			       s1+=s;
				   Collections.reverse(l1);
				   for(String s:l1)
				   s2+=s;
				   if(s1.equals(s2)){
					   temp++;
					   break;
				   }
					 }
			   if(temp>0) {
				   r=ii;
				   break;
			   }
					}
		  		   System.out.print(Integer.parseInt(inn[r]));
	}

}