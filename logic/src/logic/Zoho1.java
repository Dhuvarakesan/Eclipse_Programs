package logic;

public class Zoho1 {

	public static void main(String[] args) {
		String in="geeksforgeeks";
		for(int i=0;i<in.length();i++) {
			for(int j=0;j<in.length();j++) {
				if(i==j||i+j==in.length()-1) {
					System.out.print(in.charAt(i));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
