package practice;

public class Computer {

	public static void main(String[] args) {
		String in="computer";
		for(int i=0;i<in.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(in.charAt(j));
			}
			System.out.println();
		}

	}

}
