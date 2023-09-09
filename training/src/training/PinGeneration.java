package training;
import java.util.*;

public class PinGeneration {
public static void main(String [] args) {
	String str1="190";
	String str2="267";
	String str3="853";
	String s=str1+str2+str3;
	char a[]=s.toCharArray();
		TreeSet<Character> set=new TreeSet<>();
	for(int i=0;i<a.length;i++) {
		set.add(a[i]);
	}
	String firstDigit=Character.toString(set.last());
	int[] arr=new int [] {190,267,853};
	int [] arr1=new int[3];
	for(int i=0;i<3;i++) {
		int rem=arr[i]/100;
		arr1[i]=rem;
	}
	TreeSet<Integer> set1=new TreeSet<>();
	for(int i:arr1)
		set1.add(i);
	String secondDigit=Integer.toString(set1.first());
	int [] arr2=new int[3];
	for(int i=0;i<3;i++) {
		int rem=((arr[i])/10)%10;
		arr2[i]=rem;}
	TreeSet<Integer> set3=new TreeSet<>();
	for(int i:arr2)
		set3.add(i);
	String thirdDigit=Integer.toString(set3.first());
	int [] arr3=new int[3];
	for(int i=0;i<3;i++) {
		int rem=arr[i]%10;
		arr3[i]=rem;}
	TreeSet<Integer> set4=new TreeSet<>();
	for(int i:arr3)
		set4.add(i);
	String fourthDigit=Integer.toString(set4.first());
	System.out.println(firstDigit+secondDigit+thirdDigit+fourthDigit);
	}}
