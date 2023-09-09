package training;

public class Roughwork {

	public static void main(String[] args) {
		int input=5445;
		int temp=input;
		int size=0;
		while(temp!=0) {
			size++;
			temp=temp/10;
		}
		System.out.println(size);
		int[] a=new int [size];
		int[] b=new int [size];
		int k=0;
		while(input!=0) {
			int rem=input%10;
	        a[k]=rem;
	        k+=1;
	        input=input/10;
	        //System.out.println(k);
	        }
		for(int i=a.length-1;i>=0;i--)
System.out.print(a[i]+" ");
		for(int i=0;i<size;i++) {
			int count=0;
			for(int j=0;j<size;j++) {
				if(a[i]==a[j]&&i!=j) {
					count++;
					if(count==2)
						break;
				}
			}
			b[i]=count;
		}
		System.out.println();
		for(int i:b)
			System.out.print(i+" ");
		int sum=0;
		for(int i:b) {
			sum+=i;
		}
		System.out.println("\n"+sum);
		if(sum%2==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		}

}
