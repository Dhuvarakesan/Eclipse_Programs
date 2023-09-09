package logic;
import java.util.Scanner;

public class ToReverseEachWordInGivenArray {

	public static void main(String[] args) { 
		Scanner in=new Scanner(System.in);
		System.out.print("Enter The String:");
		String str=in.nextLine();
        String []arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
           StringBuilder w=new StringBuilder(arr[i]);
            //w.append(arr[i]);
            w.reverse();
            String haha=w.toString();
            arr[i]=haha;
        }
        String result="";
        for(String i:arr)
        	result+=i+" ";
        System.out.println(result);
        in.close();
	}
}


