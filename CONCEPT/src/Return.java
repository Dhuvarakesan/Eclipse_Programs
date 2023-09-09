
public class Return {
	 double add(int a,int b) {
		System.out.println(a+b);
		return 1.1;
	}

	public static void main(String[] args) {
		Return in=new Return();
		double a=in.add(1,2);
		System.out.println(a);
	}

}
