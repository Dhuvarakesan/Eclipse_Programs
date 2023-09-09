package training;

public class Primebet {
	public static void primebet(int num1,int num2) {
		
	for(int j=num1;j<=num2;j++) {
		
	
		boolean f= true;
		for(int i=2;i<=j;++i) {
				if(j%i==0) {
					f=false;
					break;
				}
			}
			if(f)
			
				System.out.print(j+" ");
	}
	}
	public static void main(String[] args) {
		primebet(1,20);
	}
}



