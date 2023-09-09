package logic;

public class OpenAndCloseBracket {

	public static void main(String[] args) {
		String in="public class Fact {\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		int num=3;\r\n"
				+ "		int fact=1;\r\n"
				+ "		for(int i=num;i>=1;i--) {\r\n"
				+ "			fact*=i;\r\n"
				+ "		}\r\n"
				+ "System.out.println(fact);\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "";
		int openc=0;
		int closec=0;
		char[]a=in.toCharArray();
		
		for(char i:a) {
			if(i=='{')
				openc++;
			if(i=='}')
				closec++;
		}
		if(openc==closec)
			System.out.println("Equal"+" "+"open:"+openc+" "+"close:"+closec);
		else
			System.out.println("Not Equal"+" "+"open:"+openc+" "+"close:"+closec);

	}

}
