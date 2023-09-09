package practice;
import java.util.Scanner;
public class SmallLarge {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("SIZE:");
		int size=in.nextInt();
		System.out.print("\n"+"ELEMENTS:");
		int a[]=new int [size];
		for(int i=0;i<size;i++) {
			a[i]=in.nextInt();
	 }
	 int max=0;
	 int min=':';
	 for(int i=0;i<a.length;i++) {
		 if(min>a[i])
			 min=a[i];
		 }
	 for(int i=0;i<a.length;i++) {
		 if(max<a[i])
			 max=a[i];
	 
	 }
	 System.out.println("MAX:"+max);
	 System.out.println("MIN:"+min);
	 in.close();
	}

}
