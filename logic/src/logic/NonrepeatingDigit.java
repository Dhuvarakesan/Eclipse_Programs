package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonrepeatingDigit {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 System.out.print("INPUT:");
		   int input=in.nextInt();
		String str=Integer.toString(input);
		List<Character> l1=new ArrayList<>();
		int count=0;
		char[]a=str.toCharArray();
		        for(int i=0;i<a.length;i++){
		            count=0;
		            for(int j=0;j<a.length;j++){
		                if(a[i]==a[j]&&i!=j){
		                    count++;
		                }
		              }
		            if(count==0){
	                    l1.add(a[i]);
	                }
		        }
		        String s="";
		        for(char i:l1)
		        s+=i;	
		        System.out.println(Integer.parseInt(s));
	in.close();

	}

}
