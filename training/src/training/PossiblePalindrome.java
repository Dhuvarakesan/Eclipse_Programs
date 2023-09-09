package training;

public class PossiblePalindrome {
public static void palindrome(int input) {
	System.out.println(input);
	int size=0;
	while(input!=0) {
		size++;
		input=input/10;
	}
	size=size-1;
	int a[]=new int [size];
	int b[]=new int [size];
	int sum=0;	
	int k=0;
	while(input!=0) {
		int rem=input%10;
        a[k]=rem;
        k+=1;
        input=input/10;
        System.out.println(k);
        }
	for(int i:a)
	System.out.print(i+" ");
	for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=0;j<a.length;j++) {
			if(a[i]==a[j]&&i!=j) {
				count+=1;
				//System.out.println(a[i]);
			}
			
		}
		b[i]=count;
		count=0;
		
		
		//System.out.println(count);
		
	}
	
	for(int i:b)
		System.out.print(i);
	for(int i=0;i<a.length;i++) {
		sum+=b[i];
	}
	if(sum%2!=0) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
		System.out.println(sum);
	}
	
}
	public static void main(String[] args) {
		palindrome(11111);

	}

}
