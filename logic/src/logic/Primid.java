package logic;

public class Primid {

	public static void main(String[] args) {
		int a=5;
		int t=a;
		int c=65;
		for(int i=0;i<5;i++) {
			for(int j=a;j>0;j--) 
				System.out.print(" ");
			for(int k=0;k<=i;k++)  
				System.out.print((char)c+" ");
				
			c++;
			a--;
			System.out.println();
			}
		
		for(int i=5;i>0;i--) {
			for(int j=t;j>0;j--) 
				System.out.print(" ");
			for(int k=0;k<=i;k++)  
				System.out.print((char)c+" ");
				
			c--;
			t++;
			System.out.println();
			}
			
		}

	}


