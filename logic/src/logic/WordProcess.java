package logic;

public class WordProcess {

	public static void main(String[] args) {
		String input1="Fruits like Mango and Apple are common but Grapes is rare";
		int input2=39;
		String[] str=input1.split(" ");
	    String result="";
	    int f=input2/10;
	    int s=input2%10;
	    String[] t=new String[]{str[f-1],str[s-1]};
	    for(int k=0;k<t.length;k++){ 
	        String second="";
	        String first="";
	        for(int i=t[k].length()/2;i<t[k].length();i++) 
	            first+=Character.toString(t[k].charAt(i));       
	        for(int i=(t[k].length()-1)/2;i>=0;i--) 
	            second+=Character.toString(t[k].charAt(i));
	        result+=first+second+" ";
	    }
	    System.out.println(result);
	 

	}

}
