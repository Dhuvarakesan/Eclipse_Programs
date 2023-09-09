package training;
import java.util.*;
public class Swap {

	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);   
		char l1=sc.nextLine().charAt(0); 
		char l2=sc.nextLine().charAt(0);
		char temp;
		temp=l1;
		l1=l2;
		l2=temp;
		 System.out.println(l1+"\n"+l2); 
		//swap a=new swap(l1,l2);
		sc.close();}
}
/*
 * public void swap(char l1,char l2) { char temp; temp=l1; l1=l2; l2=temp;
 * System.out.println(l1+"\n"+l2); } }
 */

	


