package logic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class MileStone4 {

	public static void main(String[] args) {
		int []a=new int[] {1,1,4,1,1,1,4};
		ArrayList<Integer>a1=new ArrayList<Integer>();
		boolean flag=true;
		for(int i:a) {
			if(i==1)
				continue;
			boolean f=true;
			for(int j=2;j<i;++j) {
				if(i%j==0) {
					f=false;}
			}
			if(f) {
				a1.add(i);
				flag=false;
			}
		}
		int sum=0;
		if(flag) {//to find the sum of Array element except largest number in array in case(if the array dosen't contain any prime it will work)
			Arrays.sort(a);
			for(int i=0;i<a.length-1;i++)
				sum+=a[i];
		}
		else {//to find the sum of all prime in the array except the largest prime...
			Collections.sort(a1);
			for(int i=0;i<a1.size()-1;i++)
				sum+=a1.get(i);
				
		}
		System.out.println("Sum:"+sum);
	}

}
