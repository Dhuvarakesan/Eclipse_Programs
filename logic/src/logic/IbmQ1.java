package logic;
import java.util.Scanner;
public class IbmQ1 {//String rotation
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Input1:");
		String in1=in.nextLine();// sample input:pandemic India
		System.out.print("\n"+"Input2:");
		String in2=in.nextLine();//Sample input:L2 or R6
		String side=in2.replaceAll("[0-9]","");
		String result="";
		int  pos=Integer.parseInt(in2.replaceAll("[^0-9]",""));
		String [] str=in1.split(" ");
		for(String i:str)
		if(side.equals("R")) {
			result+=i.substring(pos)+i.substring(0,pos)+" ";
			}
		else {
			result+=i.substring(i.length()-pos,i.length())+i.substring(0,i.length()-pos)+" ";
		}
		System.out.println(result);
		in.close();
	}

}
