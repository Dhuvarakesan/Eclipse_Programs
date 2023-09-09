package logic;

public class WifiPassword {

	public static void main(String[] args) {
		int input1=123;
		String input2="kumar";
		 int tens = (input1 /10) % 10;
	        int unitvalue=tens;
	        char ch[]=input2.toCharArray();
	        int tenvalue=ch[ch.length-1];
	        int rem1=0;
	        int temp=input1;
	        while(temp>0)
	        {
	            rem1=temp%10;
	            break;
	        }
	       char b=' ';
	        switch(rem1)
	        {
	                case 1:  b='!'; break;
	                case 2:  b='@'; break;
	                case 3:  b='#'; break;
	                case 4:  b='$'; break;
	                case 5:  b='%'; break;
	                case 6:  b='^'; break;
	                case 7:  b='&'; break;
	                case 8:  b='*'; break;
	                case 9:  b='('; break;
	                case 0:  b=')'; break;
	                
	        }
	         char hunvalue=b;
	         int sum = 0;
	         while(input1 > 0 || sum > 9) 
	         {
	            if(input1 == 0) 
	            {
	                input1 = sum;
	                sum = 0;
	            }
	            sum += input1 % 10;
	            input1 /= 10;
	         }
	        int thvalue=sum;
	        if(thvalue%2==1)
	        {
	            if(thvalue==1)
	                thvalue+=1;
	            else
	                thvalue-=1;
	        }
	     
	    
	        System.out.print(thvalue+""+hunvalue+""+(char)tenvalue+""+unitvalue);
	      
	    }

	}


