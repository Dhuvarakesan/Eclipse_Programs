package logic;

public class Zoho4 {

	public static void main(String[] args) {
		String in="((abc)(de))";
		int o=0;
		int c=0;
		for(int i=0;i<in.length();i++) {
			if(in.charAt(i)=='(') {
				o++;
			}
			else if(in.charAt(i)==')')
				c++;
		}
if(c==o) {
	System.out.println("Equal");
}
	}

}
