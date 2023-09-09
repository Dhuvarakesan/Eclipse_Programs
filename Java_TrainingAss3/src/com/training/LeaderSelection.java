/**
 * 
 */
package com.training;

import java.util.Scanner;

/**
 * There is a group selection in a crowd for an event based on the entry ticket number. For
   every group, the group leader will be the one who’s ticket number has 10 as it’s factor. If
   anyone gives the ticket number tell him/her that they are a group leader or a group
   member
 * @author dhuvarakesan
 * 27-04-2023
 */
public class LeaderSelection {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);// creating object for Scanner
		System.out.print("Enter The Ticket No:");
		int ticketNumber=in.nextInt();// getting input from user
		if(ticketNumber%10==0)//checking leader or member
			System.out.println("Group Leader");
		else
			System.out.println("Group Member");
		in.close();
	}

}
