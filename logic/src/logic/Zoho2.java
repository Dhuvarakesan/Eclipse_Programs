package logic;

import java.util.Arrays;

public class Zoho2 {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,5,6,7};
		int[] b=new int[a.length];
		System.out.println(a.length/2);
		int e=a.length;
		int o=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				b[i]=a[--e];
				System.out.print("e:"+e+" "+a[--e]+" ");
			}else {
				b[i]=a[++o];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
