package logic;
import java.util.*;
import java.util.Collections;

public class WorkingOfFrequencyInCollections {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,5,3,4,5,5};
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		for(int i:a) {
			l1.add(i);
			l2.add(i);
		}
		for(int i:l1) {
			int res=Collections.frequency(l2, i);
			System.out.print("res:"+res+" ");
		}

	}

}
