package logic;
import java.util.Scanner;
public class FindDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT:");
		String in=sc.next();
		String output="";
		for(int i=0;i<in.length();i++) {
			for(int j=0;j<in.length();j++) {
				if((i!=j)&&(in.charAt(i)==in.charAt(j))&&(output.indexOf(in.charAt(i))==-1)) {//to find duplicate digit in number
					output+=in.charAt(i);
					break;
				}
					
			}
		}
		System.out.println("OUTPUT:"+output);
		sc.close();
	}

}
