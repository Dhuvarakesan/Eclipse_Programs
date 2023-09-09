package ilink;

public class Rough {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n=7;
		//Integer a=new Integer(10);
		for(int i=2;i<n;i++){    
			 int  n3=n1+n2;
			  System.out.print(n3+" ");
			  n1=n2;    
			  n2=n3;    
			 }
	}

}
