package practice;
public class StringInputFromUser {

	public static void main(String[] args) {
		/*
		 * Scanner in=new Scanner(System.in); String str=in.nextLine();
		 * char[]a=str.toCharArray(); for(int i=0;i<str.length();i++)
		 * System.out.println(a[i]);
		 */
		String test="a. b";
		test=test.replaceAll(" +"," ");
        System.out.println(test);
	}

}
