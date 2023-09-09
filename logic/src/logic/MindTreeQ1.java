package logic;

import java.util.Scanner;

public class MindTreeQ1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input:");
		String in=sc.nextLine();
		System.out.print("\n"+"check:");
		String check=sc.next();
		in=in.replace(check,"#");
		in=in.replaceAll("[^#]","");
		System.out.println("No Of Times:"+in.length());
		sc.close();
	}

}
