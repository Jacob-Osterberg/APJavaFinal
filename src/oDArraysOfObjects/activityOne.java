package oDArraysOfObjects;

import java.util.Scanner;

public class activityOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		Friend[] friends = new Friend[20];
		for (count = 0; count < friends.length; count++) {
			friends[count] = new Friend();
		}

		for (count = 0; count < friends.length; count++) {
			System.out.println("Enter a name");
			friends[count].setName(input.nextLine());

		}

		for (count = friends.length; count > 0; count--) {

			System.out.println(friends[(count - 1)].getName());

		}

	}

}
