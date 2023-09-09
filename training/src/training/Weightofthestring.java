package training;

public class Weightofthestring {
	public static void main(String[] args) {
	String input1="Hello World";
	int input2=1;
	 int sum=0;
    String str=input1.toUpperCase();

	 for(int i=0;i<str.length();i++){
	 if(input2==0){
         if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||!Character.isLetter(str.charAt(i))){
			  continue;
		  }
		  else{
          int a=str.charAt(i)-64;
		   sum=sum+a;
		  }
	 }
	 else{
		 if(!Character.isLetter(str.charAt(i))){
			 continue;
		 }
		 else{
			 int a=str.charAt(i)-64;
			 sum+=a;

		 }
	 }
	 }


	 System.out.println(sum);
	 }
}

