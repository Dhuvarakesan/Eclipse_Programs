package com.training;
import java.util.Scanner;

/**
 * Once a baby lion lost his way in the jungle. An old deer took pity on him and planned to 
   take him to his place. But the other deer and his other friends — rabbits, squirrels, and 
   birds are scared so they accompanied. In the morning they counted themselves to see if 
   the baby lion done any mischief. Help them to find it. Total number of animals, count of 
   each (rabbit, deer, birds, and squirrels) in the morning are the inputs.
 * @author dhuvarakesan
 * 27-04-2023
 */
public class FindTotalNumberOfAnimals {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);// creating object for scanner
		int total=in.nextInt();// getting input from user
		int rabbit=in.nextInt();// getting input from user
		int deer=in.nextInt();// getting input from user
		int birds=in.nextInt();// getting input from user
		int squirrels=in.nextInt();// getting input from user
		if(total==(rabbit+deer+birds+squirrels))
			System.out.println("Baby lion is well behaved");
		if(total>(rabbit+deer+birds+squirrels))
			System.out.println("Baby lion is mischievous");
		if(total<(rabbit+deer+birds+squirrels))
			System.out.println("Counted wrongly");//
		in.close();
	}

}
