package training;
import java.util.*;
import java.util.Arrays;
public class DeleteDuplicate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Size:");
		int size=s.nextInt();
		System.out.print("\n");
		System.out.print("Elements:");
		int[] arr=new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		//Remove ac=new Remove();
		int length=arr.length;
		length=Remove(arr,size);
		for(int i=0;i<length;i++)
			System.out.print(arr[i]+" ");
	s.close();	
	}
	public  static int Remove(int[] arr,int size) {
		  if (size==0 || size==1){  
	            return size;  
	        }  
	        int[] temp = new int[size];  
	        int j = 0;  
	        for (int i=0; i<size-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[size-1];     
	        // Changing original array  
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    
		
		
		
	}

}
