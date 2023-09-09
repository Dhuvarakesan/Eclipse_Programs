package logic;

import java.util.Scanner;

public class Nthprime {
	public int nthprime(int num) {
		int count=0;
		int ref=0;
		for(int i=2;;i++) {
			int temp=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) 
					temp=0;}
			if(temp==1) {
				count++;
				ref=i;
				//System.out.println(ref);
				
			}
			if(count==num)
				break;
		}
		//System.out.println();
			System.out.println(ref);
    return ref;
	}

	public static void main(String[] args) {
		Nthprime b=new Nthprime();
		Scanner in=new Scanner(System.in);
	    System.out.print("Enter The Number:");
        int num=in.nextInt();
    	b.nthprime(num);
    	in.close();
	}
}
