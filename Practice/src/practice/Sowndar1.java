package practice;

public class Sowndar1 {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,5,6,7};
		int b[]=new int[] {11,12,13,14,5,16,17};
		int d[]=new int[] {11,21,31,41,5,61,71};
		int t1=0,t2=0,t3=0,s=0;
for(int i=0;i<a.length;i++) {
	for(int j=0;j<b.length;j++) {
		for(int k=0;k<d.length;k++) {
			if((a[i]==b[j]&&a[i]==d[k])&&(b[j]==d[k])) {
				t1=i;
				s=t1;
				t2=j;
				t3=k;
				if(s==i)
				if(j!=t2&&t3!=k)
				System.out.println(i);
			}}
		}
	}
}
	}


