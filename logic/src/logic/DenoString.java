package logic;

public class DenoString {

	public static void main(String[] args) {
		String name="dhuvarake";
		String[] str1=new String [3];
		int temp=0;
		int size=0;
		for(int i=0;i<1;i++) {
		String n =name.substring(temp, size);
		str1[i]=n;
		temp=size;
		size+=3;
		
		}
		
     for(String i:str1)
    	 System.out.println(i);
	}

}
