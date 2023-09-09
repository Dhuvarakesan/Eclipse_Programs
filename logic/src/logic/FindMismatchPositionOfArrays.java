package logic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * program for finding the first mismatch value position in arrays by using mismatch metod in arrays
 * @author dhuvarakesan
 * 19-05-20203
 */
public class FindMismatchPositionOfArrays {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the Size of both Arrays:");
		int size=in.nextInt();
		int arr1[]=new int [size];
		int arr2[]=new int [size];
		System.out.println("Enter the Array 1 values("+size+"):");
		for(int i=0;i<arr1.length;i++)
			arr1[i]=in.nextInt();
		System.out.println("Enter the Array 2 values("+size+"):");
		for(int i=0;i<arr2.length;i++)
			arr2[i]=in.nextInt();
		System.out.println("Mismatched value's position: "+Arrays.mismatch(arr1, arr2));
		in.close();
	}

}
