package training;
import java.util.*;
public class IntegerArrayToCharacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Size:");
		int size=s.nextInt();
		System.out.print("\n");
		System.out.print("Elements:");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		char[]a=new char[size];
		for(int i=0;i<size;i++) {
			a[i]=(char)arr[i];
		}
		for(char i:a) {
			System.out.println(i);
		}
		s.close();
	}

}