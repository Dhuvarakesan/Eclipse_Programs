package logic;

public class Replaceduplicatechar {

	public static void main(String[] args) {
	String str="apple";
	char[]a=str.toCharArray();
	String res="";
	for(char i:a) {
		if(res.indexOf(i)==-1)
			res+=i;
	}
	System.out.println(res);

	}

}
