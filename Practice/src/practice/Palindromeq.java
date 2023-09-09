package practice;

public class Palindromeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int temp=num;
		int res=0;
		while(temp!=0) {
			int rem=temp%10;
			res=res*10+rem;
			temp/=10;
		}
		System.out.println(res);
		if(num==res)
			System.out.println("palin");
		else
			System.out.println("not palin");

	}

}
