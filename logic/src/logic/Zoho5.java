package logic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Zoho5 {

	public static void main(String[] args) {
		int[] a=new int [] {13,2,4,15,12,10,5};
		ArrayList <Integer> odd=new ArrayList<>();
		ArrayList <Integer> even=new ArrayList<>();
		ArrayList <Integer> res=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(i%2==0)
				even.add(a[i]);
			else
				odd.add(a[i]);
		}
		Collections.sort(odd);
		Collections.sort(even);
		
		int e=0;
		int o=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0)
				res.add(odd.get(o++));
			else
				 res.add(even.get(e++));
		}
		System.out.println(Arrays.toString(a));

	}

}
