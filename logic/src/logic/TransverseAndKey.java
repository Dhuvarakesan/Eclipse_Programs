package logic;

import java.util.Arrays;

public class TransverseAndKey {

	public static void main(String[] args) {
		int result=0;
		int []a=new int [] {74,-56,15,71,92,23};
		int b[]=new int [a.length];
		int min=0;
		boolean flag=true;
		for(int i:a)
		min=Math.min(i, min);
		if(min<0)
			flag=false;
		System.out.println(flag);
		if(flag) {
			Arrays.sort(a);
			result=a[a.length-1];
		}
		else {
			int k=0;
			for(int i=0;i<a.length;) {
				int key=a[i]/10;
				if(a[i]<0) {
					b[k]=key;	
					break;}
				
				b[k]=key;
				k++;
				System.out.println(a[i]+" "+i);
				i=a[i]%10;
				}
			int z=0;
			for(int i:b)
				b[z++]=Math.abs(i);
			int add=0;
			int sub=0;
			for(int i=0;i<b.length;i++) {
				if(i%2==0)
					add+=b[i];
				else
					sub+=b[i];
			}
			result=add-sub;
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println(result);

	}

}
