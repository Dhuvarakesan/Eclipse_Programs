package logic;
import java.util.ArrayList;
import java.util.Collections;
public class MileStone4Amirtha {

	public static void main(String[] args) {
		int []in=new int [] {1,1,1,7,1,2,3,4,5,6,7,2,2,7,7,6,6,9,9,9,9,1,12,12,12,12,12,12};
		ArrayList<Integer> a=new ArrayList<Integer>();
		int max1=0,f1=0;
		int max2=0,f2=0;
		for(int i:in)
			a.add(i);
		//System.out.println(a);
		for(int i:a) {
			int t=Collections.frequency(a, i);
			//System.out.println(t);
			if(t>=f1&&i>max1) {//to find the first frequent number incase(if two numbers has same frequency then we have to find maximum of them) 
				f1=t;
				max1=i;
			}
			if((t>=f2&&i>max2)&&t<f1) {//to find the second frequent number incase(if two numbers has same frequency then we have to find maximum of them) 
				f2=t;
				max2=i;
			}
		} /*
			 * System.out.println(max1+" "+max2); System.out.println(f1+" "+f2);
			 */
		System.out.println("PassWord:"+max1+""+max2);
	}

}
