/**
 * 
 */
package com.training;

/**
 * Do the following and explore what is happening. (Print the values to see the
   impact)
 * @author dhuvarakesan
 * 26-04-2023
 */
public class TypeConversion {

	public static void main(String[] args) {
	int price=52;
	float priceInFloat=price;
	System.out.println("PriceInFloat"+priceInFloat);
	byte age=83;
	int intAge=age;
	System.out.println("Intage:"+intAge);
	int highestAge=120;
	int byteAge=highestAge;
	System.out.println("Intage:"+highestAge);
	highestAge=130;
	 byteAge=highestAge;
	 System.out.println("ByteAge:"+byteAge);
	}

}
