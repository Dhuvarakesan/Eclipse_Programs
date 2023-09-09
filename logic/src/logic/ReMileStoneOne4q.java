package logic;

public class ReMileStoneOne4q {

	public static void main(String[] args) {
		String in[]=new String[]{"mango","banana"};
         //oreo,sirish,apple
		//mango,banana
		//ate,ace,girl
		String result="";
		boolean f=true;
		for(int i=0;i<in.length;i++) {
			String t=in[i];
			t=t.replaceAll("[aeiouAEIOU]", "*");
			if(t.charAt(0)=='*'&&t.charAt(t.length()-1)=='*') {
				f=false;
				result+=in[i];
			}
			if(f)
				result="no math found";
		}
		System.out.println(result);
	}

}
