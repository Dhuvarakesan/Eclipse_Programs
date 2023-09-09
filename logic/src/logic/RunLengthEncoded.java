package logic;
import java.util.Collections;
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;*/
import java.util.LinkedHashSet;
import java.util.LinkedList;
public class RunLengthEncoded {

	public static void main(String[] args) {
		String in="wwwoooolllllmmnnbgtinndfsssvvvvveeeeeeeqqqqqqlllmvvvxxxsssssssuuuuuuuuaaaaaaaakkkkkhhhhhhhgggggggggg";
		char[] a=in.toCharArray();
		LinkedHashSet<String>s1=new LinkedHashSet<>();
		LinkedList<Character>h1=new LinkedList<>();
		String out="";
		String output="";
		for(char i:a)
			h1.add(i);

		System.out.println(h1);
		for(int  i=0;i<a.length;i++) {
			int f=Collections.frequency(h1, a[i]);
			System.out.print("a[i]:"+a[i]+" ");
			out=Character.toString(a[i])+Integer.toString(f);
			System.out.print("out:"+out+" ");
			s1.add(out);
		}
		System.out.println(s1);
		//LinkedHashSet<Character>lh1=new LinkedHashSet<>();
		String str[]=new String[s1.size()];
		int k=0;
		for(String i:s1) {
			str[k]=i;
			k++;
		}
		//System.out.println(Arrays.toString(str));
		for(int i=str.length-1;i>=0;i--) {
			System.out.println(str[i]+" ");
			output+=str[i];
		}
		//System.out.println(Arrays.toString(str));
		System.out.println(output);//w3o4l5m2n2b1g1t1i1n2d1f1s3v5e7q6l3m1v3x3s7u8a8k5h7g10
	}
}