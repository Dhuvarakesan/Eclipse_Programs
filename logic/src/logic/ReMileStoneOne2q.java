package logic;
public class ReMileStoneOne2q {

	public static void main(String[] args) {
		String in="ILkQwfg";
        String inn="QwILkfg";
        int temp=':';
        char a[]=in.toCharArray();
        char b[]=inn.toCharArray();
        int c=0;
        String t="";
        for(int i=0;i<a.length;i++) {
        	if(temp<(int)a[i]) {
        		temp=(int)a[i];
        		c++;
        		System.out.println("temp:"+temp+" count"+c);
        		System.out.println(a.length-1);
        		System.out.println((int)a[i]);
        		if(c!=a.length)
        			  t="invalid";
        			else
        		t="increasing";
        				
        	}
        	else if(temp>(int)a[i]){
        		temp=(int)a[i];
        		c++;
        		if(c==a.length)
        			t="decreasing";
            		else
                      t="invalid";
            
        	}
        	
        }
        int resc=0;
        for(int i=0;i<a.length;i++) {
        	
        	if(a[i]!=b[i])
        		resc++;
        }
        if(t=="increasing"||t=="decreasing") {
        System.out.println(t+Integer.toString(resc));
        System.out.print(c+" "+a.length);
        }
        else {
        	System.out.println(t);
	}

	}

}
