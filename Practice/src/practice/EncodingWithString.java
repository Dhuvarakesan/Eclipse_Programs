package practice;

public class EncodingWithString {

	public static void main(String[] args) {
		String input1="john";
		String input2="johny";
		String input3="janardhan";
		String s1f="",s1m="",s1l="";
	    String s2f="",s2m="",s2l="";
	    String s3f="",s3m="",s3l="";
	       String o2="";
	       String o1="";
	       String o3="";
	       int d=0;
	       if(input1.length()%3==0) {
	    		d=input1.length()/3;
	    		s1f=input1.substring(0, d);
	    		s1m=input1.substring(d,2*d);
	    		s1l=input1.substring(2*d);
	    	}
	    	else if(input1.length()%3==1) {
	    		d=input1.length()/3;
	    		s1f=input1.substring(0, d);
	    		s1m=input1.substring(d,2*d+1);
	    		s1l=input1.substring((2*d)+1);
	    		}
	    	else {
	    		d=input1.length()/3;
	    		s1f=input1.substring(0, d+1);
	    		s1m=input1.substring(d+1,2*d+1);
	    		s1l=input1.substring((2*d+1));
	    	}
	    	if(input2.length()%3==0) {
	    		d=input2.length()/3;
	    		s2f=input2.substring(0, d);
	    		s2m=input2.substring(d,2*d);
	    		s2l=input2.substring(2*d);
	    	}
	    	else if(input2.length()%3==1) {
	    		d=input2.length()/3;
	    		s2f=input2.substring(0, d);
	    		s2m=input2.substring(d,2*d+1);
	    		s2l=input2.substring((2*d)+1);
	    		}
	    	else {
	    		d=input2.length()/3;
	    		s2f=input2.substring(0, d+1);
	    		s2m=input2.substring(d+1,2*d+1);
	    		s2l=input2.substring((2*d+1));
	    	}
	    	if(input3.length()%3==0) {
	    		d=input3.length()/3;
	    		s3f=input3.substring(0, d);
	    		s3m=input3.substring(d,2*d);
	    		s3l=input3.substring(2*d);
	    	}
	    	else if(input3.length()%3==1) {
	    		d=input3.length()/3;
	    		s3f=input3.substring(0, d);
	    		s3m=input3.substring(d,2*d+1);
	    		s3l=input3.substring((2*d)+1);
	    		}
	    	else {
	    		d=input3.length()/3;
	    		s3f=input3.substring(0, d+1);
	    		s3m=input3.substring(d+1,2*d+1);
	    		s3l=input3.substring(2*d+1);
	    	}
	    		       o1=s1f+s2f+s3f;
	    		       o2=s1m+s2m+s3m;
	    		       o3=s1l+s2l+s3l;
	    		       String out3="";
	    		       for(int h=0;h<o3.length();h++){
	    		           if(Character.isUpperCase(o3.charAt(h))){
	    		               out3+=String.valueOf(Character.toLowerCase(o3.charAt(h)));
	    		           }
	    		           else{
	    		               out3+=String.valueOf(Character.toUpperCase(o3.charAt(h)));
	    		           }
	    		       }

	       System.out.print(o1+"\n"+o2+"\n"+out3);


	}

}
