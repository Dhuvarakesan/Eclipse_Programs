package practice;

public class ReplaceDuplicate {

	public static void main(String[] args) {
		 String in="1122334455";
	        String out="";
	        for(int i=0;i<in.length();i++) {
	        if(out.indexOf(in.charAt(i))==-1){
	            out+=in.charAt(i);
	            i++;
	            
	        }
	        else{
	            i++;
	        }
	        }
	        System.out.println(out);
	       

	}

}
