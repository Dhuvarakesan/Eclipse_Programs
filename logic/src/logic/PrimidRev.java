package logic;

public class PrimidRev {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int k=0;k<i;k++)
				System.out.print(" ");
			for(int j=5-i;j>0;j--)
				System.out.print("*"+" ");
			System.out.println();
		}

	}

}
