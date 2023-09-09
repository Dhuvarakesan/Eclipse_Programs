package logic;

import java.util.Scanner;

public class ODDEVEN {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter The Input:");
		int input=in.nextInt();
		String []array=new String[] {"EVEN","ODD"};
		System.out.println(array[input%2]);
		in.close();
	}

}
