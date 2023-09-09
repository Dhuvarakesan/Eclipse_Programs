package Trafiff;

import java.util.Scanner;

public class TrafiifModule {
	Scanner scannerobject=new Scanner(System.in);
 int unit;
 double price;
 
 TrafiifModule(){
	 setUnit();
	 setPrice();
	 
 }

public int getUnit() {
	return unit;
}

public void setUnit() {
	unit =scannerobject.nextInt();
}

public double getPrice() {
	return price;
}

public void setPrice() {
	price=scannerobject.nextDouble();
}
 
  
}
