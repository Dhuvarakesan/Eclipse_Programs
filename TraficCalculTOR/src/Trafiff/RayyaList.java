package Trafiff;

import java.util.ArrayList;
import java.util.Scanner;

public class RayyaList {
	Scanner scannerObject=new Scanner(System.in);
	
	ArrayList arrayListObject=new ArrayList<>();
	void addList() {
		arrayListObject.add(new TrafiifModule());
	}
	
	public static void main(String[] args) {
		RayyaList s=new RayyaList();
		s.addList();
		for(int i=0;i<s.arrayListObject.size();i++) {
		System.out.println(s.arrayListObject.contains(s));
		}
	}
}
