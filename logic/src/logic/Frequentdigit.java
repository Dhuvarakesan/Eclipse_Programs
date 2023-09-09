package logic;
import java.util.*;
public class Frequentdigit {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 System.out.print("INPUT:");
		   int input=in.nextInt();
		String str=Integer.toString(input);
		int count=0;
		int cmax=0;
		char temp='!';
		char[]a=str.toCharArray();
		        for(int i=0;i<a.length;i++){
		            count=0;
		            for(int j=0;j<a.length;j++){
		                if(a[i]==a[j]&&i!=j){
		                    count++;
		                }
		                if(count>cmax){
		                    cmax=count;
		                    temp=a[i];
		                }
		            }
		        }
		        int res=Character.getNumericValue(temp);
		        System.out.println("frequent digit:"+res);
	in.close();
	}

}
