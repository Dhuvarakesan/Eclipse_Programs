package logic;
import java.util.ArrayList;
public class Zoho {

	public static void main(String[] args) {
			String in="a1b10";
			ArrayList <Integer> a=new ArrayList<>();
			String alp=in.replaceAll("[0-9]","");
			String num=in.replaceAll("[^0-9]"," ");
			String [] str=num.split(" ");
			for(String i:str)
			if(!i.isEmpty())
			a.add(Integer.parseInt(i));
			for(int i=0;i<a.size();i++)
			for(int j=0;j<a.get(i);j++)
			System.out.print(alp.charAt(i));
	}

}
