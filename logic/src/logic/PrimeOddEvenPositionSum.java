package logic;

public class PrimeOddEvenPositionSum {
	public static void main(String[] args) {
		int arr[]=new int[] {2,3,4,5,6,7,8,9};
		int evensum=0;
		int oddsum=0;
		for(int in=0;in<arr.length;in++) {
			boolean f=true;
			for(int i=2;i<arr[in];i++) {
				if(arr[in]%i==0) {
					f=false;
			}
			}
			if(f&&in%2==0) {//even position prime
				System.out.print(arr[in]+" ");
				evensum+=arr[in];
			}
			else if(f&&in%2!=0) {
				System.out.print(arr[in]+" ");
				oddsum+=arr[in];
			}
		}
		System.out.println("\n"+"EVEN POS SUM:"+evensum);
		System.out.println("ODD POS SUM:"+oddsum);

	}

}

