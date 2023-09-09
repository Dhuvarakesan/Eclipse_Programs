package training;

public class Calculator {
	int num1;
	int num2;
	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public static void powerInt(int num1,int num2) {
		int power;
		power=(int)Math.pow(num1, num2) ;
		System.out.println(power);
		//return power;
		
	}
	public static void powerDouble(double num1,int num2) {
		System.out.println(Math.pow(num1, (int)num2));
		//return Math.pow(num1, (int)num2) ;
	}

}
