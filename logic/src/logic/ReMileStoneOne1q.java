package logic;

public class ReMileStoneOne1q {

	public static void main(String[] args) {		
		        char in[]= {'A','B','C'};
				char inn[]= {'B','C'};
				
				String q="";
				String qq="";
				
				for(char i:in)
					q+=i;
				for(char i:inn)
					qq+=i;
				System.out.println(q+" "+qq);
				String t=q.replaceAll(qq,"");
				System.out.println(t);
				char re[]=t.toCharArray();
				int s=(int)re[0];
				if(sum(s)>9) {
					System.out.println(sum(sum(s)));
				}
				else {
			System.out.println(sum(s));	
				}

			}
			public static int sum(int n) {
				int s=0;
				while(n!=0) {
				int rem=n%10;
				s+=rem;
				n/=10;}return s;
			}

		}

