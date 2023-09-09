package logic;

public class StringNameProcess {

	public static void main(String[] args) {
	String input1="john";
	String input2="johny";
	String input3="janardhan";
		int s1=input1.length();
		int s2=input2.length();
		int s3=input3.length();
		String s1f="";String s2f="";String s3f="";
		String s1m="";String s2m="";String s3m="";
		String s1l="";String s2l="";String s3l=""; 
	        if(s1%3==0){
	            int temp=0;
	            int i=0;
	            for( i=0;i<3;i++) {
	            s1f+=Character.toString(input1.charAt(i));temp++;}
			for (; i <3*2 ;i++) {
				System.out.println(temp);
	                 s1m+=Character.toString(input1.charAt(i));temp++;}
					for (; i < 3*3;i++) {
	                 s1l+=Character.toString(input1.charAt(i));temp++;
	                 if(temp==s1)
	                	 break;}
	        }
	        if((s1-1)%3==0) {
	        	s2f=Character.toString(input2.charAt(0));
	        	s2m=Character.toString(input2.charAt(1))+Character.toString(input2.charAt(2));
	        	s2l=Character.toString(input2.charAt(3));
	        }
	        if((s1+1)%3==0) {
	        	s3f=Character.toString(input2.charAt(0))+Character.toString(input2.charAt(1));
	        	s3m=Character.toString(input2.charAt(2));
	        	s3l=Character.toString(input2.charAt(3))+Character.toString(input2.charAt(4));
	        }
	        	String res=s1f+s2m+s3l+s1m+s2l+s3f+s1l+s2f+s3m;
	        System.out.println(res+(s2+s3));
	}

}
