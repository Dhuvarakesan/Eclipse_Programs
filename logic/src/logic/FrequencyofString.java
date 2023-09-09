package logic;

public class FrequencyofString {

	public static void main(String[] args) {
		String in="wwwoooolllllmmnnbgtinndfsssvvvvveeeeeeeqqqqqqlllmvvvxxxsssssssuuuuuuuuaaaaaaaakkkkkhhhhhhhgggggggggg";
		char[] a=in.toCharArray();
		String result="";
		int count=1;
		char t='.';
		int te=0;
		for(int  i=0;i<a.length;i++) {
			if(a.length-i==1) {
				result+=Character.toString(a[a.length-1])+Integer.toString(te);
				break;
			}
			else {
			if(a[i]==a[i+1]) {
				t=a[i];
				count++;
				te=count;
			}
			else if(a[i]!=a[i+1]&&a[i]!=a[i-1]) {
				t=a[i];
				result+=Character.toString(t)+Integer.toString(1);
			}
			else {
				result+=Character.toString(t)+Integer.toString(count);
				count=1;
				//System.out.println(t+""+count);
			}
			}
		}
		String org="w3o4l5m2n2b1g1t1i1n2d1f1s3v5e7q6l3m1v3x3s7u8a8k5h7g10";
		System.out.println(result);//w3o4l5m2n2b1g1t1i1n2d1f1s3v5e7q6l3m1v3x3s7u8a8k5h7g10
		System.out.println(org);
		if(org.equals(result))
			System.out.println("Correct");
		else
			System.out.println("Not Correct");



	}

}
