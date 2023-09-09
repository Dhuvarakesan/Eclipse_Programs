package logic;

import java.util.Arrays;
import java.util.Scanner;

public class Highest3numSum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("INPUT1:");
		int input1=in.nextInt();String s1=Integer.toString(input1);System.out.print("\n"+"INPUT2:");
		int input2=in.nextInt();String s2=Integer.toString(input2);System.out.print("\n"+"INPUT3:");
		int input3=in.nextInt();String s3=Integer.toString(input3);System.out.print("\n"+"INPUT4:");
		int input4=in.nextInt();String s4=Integer.toString(input4);System.out.print("\n"+"INPUT5:");
		int input5=in.nextInt();String s5=Integer.toString(input5);	
        char[]a=s1.toCharArray();Arrays.sort(a);
        char[]b=s2.toCharArray();Arrays.sort(b);
        char[]c=s3.toCharArray();Arrays.sort(c);
        char[]d=s4.toCharArray();Arrays.sort(d);
        char[]e=s5.toCharArray();Arrays.sort(e);
        String r1=String.valueOf(a[a.length-1])+String.valueOf(a[a.length-2])+String.valueOf(a[a.length-3]);
        String r2=String.valueOf(b[b.length-1])+String.valueOf(b[b.length-2])+String.valueOf(b[b.length-3]);
        String r3=String.valueOf(c[c.length-1])+String.valueOf(c[c.length-2])+String.valueOf(c[c.length-3]);
        String r4=String.valueOf(d[d.length-1])+String.valueOf(d[d.length-2])+String.valueOf(d[d.length-3]);
        String r5=String.valueOf(e[e.length-1])+String.valueOf(e[e.length-2])+String.valueOf(e[e.length-3]);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
        System.out.println(Integer.parseInt(r1)+Integer.parseInt(r2)+Integer.parseInt(r3)+Integer.parseInt(r4)+Integer.parseInt(r5));
        in.close();
	}

}
