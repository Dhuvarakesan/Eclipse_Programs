package logic;

public class CharArrayToString {

	public static void main(String[] args) {
		String a="wipro";
        String result="";
        char[]b=a.toCharArray();
        for(int i=0;i<b.length;i++){
            if(i%2==0){
                result+=Character.toString(b[i]);
            }
        }
        //System.out.println(result);
        StringBuffer sb=new StringBuffer(result);
          System.out.println(sb.reverse());
	}

}
