import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
public class MapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer>freq=new HashMap<>();
		int a[]=new int []{3,38,5,7,9,1,2,12,55,34,22,7,6,33,45,1,1,7,7,9,9,9,55};
		ArrayList<String> A1=new ArrayList<>();
		ArrayList<Integer> A2=new ArrayList<>();
		for(int i:a)
			A1.add(Integer.toString(i));
		System.out.println(A1);
		  for(String i:A1) { 
			  int f=Collections.frequency(A1,i);
			  freq.put(i, f);
			  A2.add(f);
					  }
		  Collections.sort(A2);
		  System.out.println(A2);
		  System.out.println(freq.get(A2.get(0)));
		  System.out.println(freq);
		  System.out.println(freq.size());
		  int minFreqEle=0;
			/*
			 * for(int i=0;i<freq.size();i++) { if( freq.get(A2.get(i))>minFreqEle) {
			 * minFreqEle=freq.get(A2.get(i)); } }
			 */
		  System.out.println("freq:"+minFreqEle);
		 

	}

}
