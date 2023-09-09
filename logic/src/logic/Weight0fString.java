package logic;

public class Weight0fString {

	public static void main(String[] args) {
		int []a =new int []{6 ,-42 ,39, -78 ,11 ,-27 ,17 ,-74 ,50 ,-53 ,10 ,-49 ,27 ,-47 ,42 ,-77 ,20 ,-70 ,33 ,-5 ,49 ,-58 ,26 ,-31 ,16 ,-25 };
		String in="!!! @@@@ $$$$ %%%% &&&& ***";
		int sum=0;
		String[] str=in.split(" ");
		for(int j=0;j<str.length;j++){
		str[j]=str[j].toUpperCase();
		System.out.println(str[j]);
		char[]c=str[j].toCharArray();
		int size=c.length;
		for(char i=0;i<c.length;i++){
		int t=0;
		if(c[i]>='A'&&c[i]<='Z'){
		t=c[i]-64;
		System.out.println("t:"+t);
		System.out.println("Sum:"+sum);
		sum+=a[t-1];
		size--;
		System.out.println("Size:"+size);
		System.out.println("values:"+a[t-1]);
		 if(size==0&&a[t-1]<0) {
				sum+=t;
				System.out.println("for -value:"+t);
		 }
		}
		else {
		if(c[i]=='!') {
		sum+=33;
		System.out.println("SpecialCharacter:"+c[i]+" "+"33");
		System.out.println("sum:"+sum);}
		else if(c[i]=='*') {
		sum+=42;}
		else if(c[i]=='@') {
		sum+=64;}
		else if(c[i]=='$') {
		sum+=36;}
		else if(c[i]=='%') {
		sum+=37;}
		else if(c[i]=='&') {
		sum+=38;}
		}
		}
		}
		System.out.println("Sum:"+sum);
		System.out.println(in);

	}

}
