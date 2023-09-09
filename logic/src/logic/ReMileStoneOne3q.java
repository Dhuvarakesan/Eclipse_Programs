package logic;
import java.util.Arrays;
public class ReMileStoneOne3q {

	public static void main(String[] args) {
		String input1="accept Van";
		int count=0;
	    String str[]=input1.split(" ");
	    for(int i=0;i<str.length;i++){
	        String res="";
	        char ch[]=str[i].toCharArray();
	        Arrays.sort(ch);
	        for(int j=0;j<ch.length;j++){
	            res+=""+ch[j];    
	        }
	       
	        if(str[i].equals(res)){
	            count++;
	        }
	    }
	    System.out.println( count);

	}

}
