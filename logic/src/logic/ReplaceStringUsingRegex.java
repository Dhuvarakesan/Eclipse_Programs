package logic;



public class ReplaceStringUsingRegex {

	public static void main(String[] args) {
		String in="wipro!2545 limited";
		String str="abcdef";
		String s=in.replaceAll("[^A-z]","");
		//str=str.replaceAll("[aeiou]","[AEIOU]");
		System.out.println(s);
		System.out.println(str);
		String sout="";
		
		char []c=str.toCharArray();
		for(int i=0;i<str.length();i++) {
           if(c[i]=='a'|| c[i]=='e'|| c[i]=='i'|| c[i]=='o'|| c[i]=='u'){
               c[i]=(char)(c[i]-32);
		}}
		for(char i:c)
			sout+=i;
			
			System.out.println(sout);

}
}
