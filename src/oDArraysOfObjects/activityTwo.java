package oDArraysOfObjects;

import java.util.Scanner;

public class activityTwo {

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
		System.out.println("Gimmy a leter");
		String letter = input.nextLine();
		for (count = 0; count < friends.length; count++) {
			Friend friends2 = friends[count];
			String name = friends2.getName();
			String lastLetter = name.substring((name.length() - 1));
			if (lastLetter.equals(letter))
				System.out.println(friends[count].getName());
		}

	}

}
