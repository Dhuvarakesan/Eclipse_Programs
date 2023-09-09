package practice;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class AccordingtofrequencyArrayArrangement {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
    int size1=in.nextInt();
    int[] arr1=new int[size1];
    for(int i=0;i<size1;i++)
        arr1[i]=in.nextInt();
    int size2=in.nextInt();
    int[] arr2=new int[size2];
    for(int i=0;i<size2;i++)
        arr2[i]=in.nextInt();
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i:arr1)
        arr.add(i);
    for(int i:arr2)
        arr.add(i);
 ArrayList<Integer> a=new ArrayList<>();
 HashSet<Integer>s=new HashSet<>();
 for(int i:arr) {
  a.add(i);
  s.add(i);
 }
 ArrayList<Integer> free=new ArrayList<>();
 for(int i:s) {
 int f=Collections.frequency(a,i);
 free.add(f);
 }
 Collections.sort(free);
 Collections.reverse(free);
 LinkedHashSet<Integer>fr=new LinkedHashSet<>();
 for(int i:free)
 fr.add(i);
 ArrayList<Integer> fre=new ArrayList<>();
 for(int i:fr)
 fre.add(i);
 LinkedList<Integer> ee=new LinkedList<>();
 int k=0;
 //System.out.println(fre);
 for(int e=0;e<fre.size();e++){
 for(int i:s) {
 if(fre.get(k)==Collections.frequency(a,i)) {
  for(int j=0;j<fre.get(k);j++) {
   //System.out.print(i);
   ee.add(i);
    }
  }
 }
 k++;
 }
  //System.out.println(ee);
  for(int i:ee) 
  System.out.print(i+" ");
  in.close();
  }

}