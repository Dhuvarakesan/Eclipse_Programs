package logic;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Collections;
public class FrequencyOfArray {

	public static void main(String[] args) {
		int[] arr=new int [] {2,3,2,4,5,12,2,3,3,3,12};
		ArrayList<Integer> a=new ArrayList<>();
		HashSet<Integer>s=new HashSet<>();
		for(int i:arr) {
			a.add(i);
			s.add(i);
		}
		ArrayList<Integer> fre=new ArrayList<>();
		
		for(int i:s) {
		int f=Collections.frequency(a,i);
		fre.add(f);
		
		}
		Collections.sort(fre);
		Collections.reverse(fre);
		LinkedList<Integer> ee=new LinkedList<>();
		
		System.out.println(fre);
		for(int i:s) {
			int k=0;
		if(fre.get(k)==Collections.frequency(a,i)) {
			for(int j=0;j<fre.get(k);j++) {
				System.out.print(i+" ");
				ee.add(i);
				}
			k++;	
		}
		
		
			}
		
		//System.out.println(fre.get(fre.size()-1));
		System.out.println(ee);
			}
}

		

	


