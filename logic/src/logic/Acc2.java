package logic;
import java.util.Scanner;
public class Acc2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		int t=0;
		for(int i=in.length()-1;i>0;i--) {
		if(in.charAt(i)>'A'&&in.charAt(i)<'z') {
		t=i;
		break;
		}
		}
		t+=1;
		String out=in.substring(t, in.length());
		int f=0,s=0;
		if(out.length()==3) {
		f=Integer.valueOf(out.charAt(0)+"");
		s=Integer.valueOf(out.charAt(1)+""+out.charAt(2)+"");
		}
		else if(out.length()==2) {
		f=Integer.valueOf(out.charAt(0)+"");
		s=Integer.valueOf(out.charAt(1)+"");
		}
		else if(out.length()==4) {
		f=Integer.valueOf(out.charAt(0)+""+out.charAt(1)+"");
		s=Integer.valueOf(out.charAt(2)+""+out.charAt(3)+"");
		}

		if(f%2==0&&s%2==0)
		System.out.println("true");
		else
		System.out.println("false");
		sc.close();
	}

}
