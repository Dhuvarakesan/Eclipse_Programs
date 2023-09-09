package logic;

public class IsEven {

	public static void main(String[] args) {
		IsEven a=new IsEven();
	//a.last(123);
	a.sumoflast(123,123);
System.out.println(a.secondlast(123));
	}
	
	
	public int last(int a) {
		int rem=a%10;
		//System.out.println(Math.abs(rem));
		return rem;
	}
	public int secondlast(int a) {
		if(a>10) {
			int rem=a/10;
			a=rem%10;
			return a;
		}
		else {
			return -1;
		}
	}
	public int sumoflast(int a,int b) {
	 a=last(a);
		b=last(b);
		int sum;
		sum=a+b;
		System.out.print("sum:"+sum+"\n"+"a:"+a+"\n"+"b:"+b);
		return sum;
		
		
		/*
		 * int sum; int rem1; int rem2; rem1=a%10; rem2=b%10; sum=rem1+rem2;
		 * System.out.println(sum); return sum;
		 */
	}

}
