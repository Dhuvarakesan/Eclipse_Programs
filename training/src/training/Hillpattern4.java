package training;

public class Hillpattern4 {

	public static void main(String[] args) {
		int n= 5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=n;i>0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
