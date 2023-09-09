package training;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
import java.util.LinkedList;
public class Banari {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		TreeSet<String> llist=new TreeSet<String>();
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			list.add(in.next());
		}
		int max=0;
		for(String i:list) {
			int freq=Collections.frequency(list,i);
			if(max<freq) {
				max=freq;
			}
			llist.add(i);
			
		}
		System.out.println(llist);
	}

}
