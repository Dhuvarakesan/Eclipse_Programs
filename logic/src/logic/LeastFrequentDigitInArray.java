package logic;

import java.util.ArrayList;
import java.util.Collections;

public class LeastFrequentDigitInArray {

	public static void main(String[] args) {
		int []input1=new int[] {1123 ,-34 ,345 ,453};
		for(int i=0;i<input1.length;i++) {
            input1[i]=Math.abs(input1[i]);
        }
        int min =1;
        char minele=':';
        ArrayList<Character> l1=new ArrayList<>();
          ArrayList<Character> l2=new ArrayList<>();
    
        for(int i=0;i<input1.length;i++){
              String e=Integer.toString(input1[i]);
              char[]a=e.toCharArray();
              
              for(char k:a) {
                  l1.add(k);
                  l2.add(k);
              }
          }
        
       for(char k:l1) {
            int temp=Collections.frequency(l2,k);
            char t=k;
            if(temp<=min&&t<minele) {
                min=temp;
                minele=t;
            }
            
       }
    String h=Character.toString(minele);
    int result=0;
    if(h.equals(":"))
        result=0;
    else
    result=Integer.parseInt(h);
    
   System.out.println(result); 

	}

}
