package logic;

import java.util.Scanner;

public class HackerRankQ {
	private static String output1;

	public static void userIdGeneration(String input1, String input2, int input3, int input4) {
        String first="";
        String second="";
        String third="";
        String fourth="";
        String f="";
        String s="";
        String result="";
        if(input1.length()>input2.length()){
            f=input1;
            s=input2;
        }
		/*
		 * else if(input1.length()==input2.length()){
		 * if(input1.charAt(0)>input2.charAt(0)){ f=input1; s=input2; } }
		 */
        else{
            f=input2;
            s=input1;
        }
        first=Character.toString(f.charAt(0));
        second=s;
        String num=Integer.toString(input3);
        third=Character.toString(num.charAt(input4-1));
        fourth=Character.toString(num.charAt(num.length()-input4));
        result=first+second;
        char[]t=result.toCharArray();
        for(int i=0;i<result.length();i++){
            if(t[i]>=65&&t[i]<=90)
                t[i]=Character.toLowerCase(t[i]);
                else
                    t[i]=Character.toUpperCase(t[i]);
        }
        result="";
        for(char i:t)
        result+=Character.toString(i);
        result=result+third+fourth;
        output1=result;
    }

   public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     String input1=in.next();
     String input2=in.next();
     int input3=in.nextInt();
     int input4=in.nextInt();
     userIdGeneration(input1, input2, input3, input4);
     System.out.println(output1);
     in.close();
    }

}


