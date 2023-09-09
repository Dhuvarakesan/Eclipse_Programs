package training;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in="maadam";
		StringBuffer inn=new StringBuffer(in);
		
		if(in.equals(new String(inn.reverse())))
			System.out.println("yes");
		else
			System.out.println("n0");
	}

}
