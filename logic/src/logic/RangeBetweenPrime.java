package logic;

public class RangeBetweenPrime {

	public static void main(String[] args) {
		int num1=2;
		int num2=5;
		
		for(int i=num1;i<=num2;i++){
			boolean f=true;
			for(int j=2;j<i;j++){
				if(i%j==0)
				f=false;
			}
			if(f)
				System.out.print(i+" ");
		}

	}

}
