package logic;
import java.util.*;
public class Moondraft1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("INPUT:");
		String input=in.nextLine();
		String str[]=input.split(" ");
		String result="";
		String temp="";
		for(String i:str) {
			char[]arr=i.toCharArray();
			temp+= Character.toString(Character.toUpperCase(arr[0]));
			for(int j=1;j<i.length();j++) {
				temp+=Character.toString(arr[j]);
			}
			result+=temp+" ";
			temp="";
		}
		System.out.println(result);
		in.close();
	}

}
