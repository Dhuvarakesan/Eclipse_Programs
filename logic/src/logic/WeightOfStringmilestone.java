package logic;

public class WeightOfStringmilestone {

	public static void main(String[] args) {
		int []a =new int []{6 ,-42 ,39, -78 ,11 ,-27 ,17 ,-74 ,50 ,-53 ,10 ,-49 ,27 ,-47 ,42 ,-77 ,20 ,-70 ,33 ,-5 ,49 ,-58 ,26 ,-31 ,16 ,-25 };
		String in="String hello";
		in=in.toUpperCase();
		String []str=in.split(" ");
		int weight=1;
		int s=0;
		int f=0;
		for(int i=0;i<str.length;i++) {
			char []ch=str[i].toCharArray();
			for(int c:ch) {
				int temp=a[c-65];
				if(temp<0&&(f==0||f==ch.length-1)) {
					s+=(c-65)+1;
					s+=temp;
				}
				else {
					s+=temp;
				}
				f++;
			}
			f=0;
			weight*=s;
			s=0;
			}
		System.out.println(weight);

	}

}
