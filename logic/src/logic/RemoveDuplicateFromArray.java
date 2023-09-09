package logic;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int []in=new int[] {1,1,2,3,4,2,11,3,3,4};
		String out="";
		for(int i:in) {
			if(out.indexOf(String.valueOf(i))==-1)//to remove duplicate numbers from the array
				out+=i+" ";
		}
		//System.out.println(out);
		String []str=out.split(" ");
		System.out.print(Arrays.toString(str));//disadvantage  input is integer array but output is string array but we can resolve it...
		

	}

}
