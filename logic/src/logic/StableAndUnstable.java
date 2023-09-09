package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.*;
public class StableAndUnstable {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("INPUT:");
		int a=11112222;
        String s=Integer.toString(a);
        HashSet<Character> l1=new HashSet<>();
        HashSet<Integer> l2=new HashSet<>();
        ArrayList<Character> l=new ArrayList<>();
        for(char i:s.toCharArray()){
        l1.add(i);
        l.add(i);}
        for(char i:l1){
         int res=Collections.frequency(l,i);
         System.out.println("res:"+res);
            l2.add(res);
        }
        for(int i:l2)
        System.out.println("set l2:"+i);
        if(l2.size()==1)
        System.out.print("stable:"+a);
        else
        System.out.print("unstable:"+a);
        in.close();
	}

}
