package training;

import java.util.Scanner;

public class Task2 {
	public int convertnumbertoarray(int num) {
		int size;
		String b=num+"";//convert integer to String 
		 size=b.length();//to get the integer size by changing the number to string and using length method we can find size
		 int[] arr=new int [size];
		 int temp=num;
		 int k=size-1;
		while(temp!=0) {
			int rem=temp%10;
			arr[k]=rem;//to store given number to array
			k-=1;
			temp=temp/10;
			}
		int sum=0;
		int tc=0;
		for(int i=size;i>0;i--){
			for( int j=tc;j<size;j++) {//we assign the ts to j because by next iteration sum should skip the 
				sum+=arr[j];//sum the given array elements
		}
			tc++;//we increment ts because the sum should be like this 
																	//1+2+3+4
			                                                        //2+3+4
																	//3+4
																	//4
																
		}
		System.out.println("Sum:"+sum);
		return sum;
		}
	public int sumofdigit(int num) {
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("Sum Of Digits Result:"+sum);
		return sum;
	}


	public static void main(String[] args) {
		Task2 a=new Task2();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=s.nextInt();
		//a.convertnumbertoarray(1234);
		System.out.println(a.sumofdigit(a.convertnumbertoarray(num)));
		s.close();

	}

}
