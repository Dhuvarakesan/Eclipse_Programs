package logic;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;*/

public class Demo {
	public static void sum(int input1) {
		int sum=0;
        int temp=0;
        		temp=input1;
        //System.out.println(temp);
        for(;;) {
        while(temp!=0){
            int rem=temp%10;
            sum+=rem;
            temp=temp/10;
            }
        if(sum<=9) {
        	break;}
        else {
        	temp=sum;
        	sum=0;
        }
        }
        System.out.println(sum);
	}


	public static void main(String[] args) {
		int input1=623;
		sum(input1);
	
}
}
        
		/*
		 * String input2="kumar"; char tens=input2.charAt(input2.length()-1);
		 * System.out.println(tens);
		 */
		/*
		 * int arr1[]=new int []{1,2,3,4,5,6,3,3,2,7}; int arr2[]=new int
		 * []{5,9,3,4,5,6,3,3,9,7}; ArrayList<Integer> l1=new ArrayList<Integer>();
		 * ArrayList<Integer> l2=new ArrayList<Integer>(); ArrayList<Integer> result=new
		 * ArrayList<Integer>(); //HashMap<Integer, Integer> numbers = new HashMap<>();
		 * for(int i:arr1) l1.add(i); for(int i:arr2) l1.add(i); System.out.println(l1);
		 * 
		 * for(int i:arr1) l2.add(i); for(int i:arr2) l2.add(i); int max=0; for(int
		 * k:l1) { int t=Collections.frequency(l2,k); result.add(t); result.add(k); }
		 * 
		 * //for(int i=0;i<numbers.size();i++) System.out.println();
		 * System.out.println(result);
		 */
		/*
		 * int inn=0; String in="Wipro Technologies Bangalore"; String out="";
		 * 
		 * String[] a=in.split(" "); for(String i:a) { StringBuilder q=new
		 * StringBuilder(i); q.reverse(); out+=q+" "; }
		 * 
		 * 
		 * 
		 * String re=""; if(inn==1) {
		 * 
		 * String[] t=out.split(" "); for(int z=0;z<t.length;z++) {
		 * char[]s=t[z].toCharArray(); s[0]=Character.toUpperCase(s[0]);
		 * //s[s.length-1]=Character.toUpperCase(s[s.length-1]); for(char i:s) { re+=i;
		 * } re+=" ";
		 * 
		 * } out=re; } if(inn==0) { String[] t=out.split(" "); for(int
		 * z=0;z<t.length;z++) { char[]s=t[z].toCharArray();
		 * //s[0]=Character.toUpperCase(s[0]);
		 * s[s.length-1]=Character.toUpperCase(s[s.length-1]); for(char i:s) { re+=i; }
		 * re+=" ";
		 * 
		 * } out=re; }
		 * 
		 * System.out.println(out);
		 */		/*
		 * String []a=new String[]{"4", "3"," 2"," 4"," 2", "3", "1"}; String []b=new
		 * String[]{"1", "3"," 2"," 4"," 2", "3", "4"};
		 * 
		 * if(Arrays.equals(a,b)) System.out.print("Equal"); else
		 * System.out.print("Not Equal");
		 * 
		 * int t=175; int num=t; int r=num%100; num=t; int d1=num/100;
		 * //System.out.println(r+" "+d1+" "); int a=1; int b=2; int c=3; int d=4; int
		 * all=0; all=a*10+b; all*=10+c; all*=10+d; int[] arr=new int[] {a,b,c,d};
		 * Set<Integer> us=new TreeSet<>(); for(int i:arr) //arr[i]=us.add(i); String
		 * q="hello"; System.out.println(all); System.out.println(" num");
		 * 
		 * System.out.println(Integer.parseInt(Integer.toString(a)+Integer.toString(b)+
		 * Integer.toString(c)+Integer.toString(d))); StringBuffer e=new StringBuffer();
		 * 
		 * e.reverse(); System.out.println(e);
		 */
	
